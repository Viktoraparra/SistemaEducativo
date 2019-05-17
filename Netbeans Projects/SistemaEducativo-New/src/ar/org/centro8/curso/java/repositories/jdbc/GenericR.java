package ar.org.centro8.curso.java.repositories.jdbc;
import ar.org.centro8.curso.java.repositories.interfaces.I_GenericR;
import java.sql.PreparedStatement;
import java.lang.reflect.Field;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
public class GenericR<E> implements I_GenericR<E>{
    private Connection conn;
    private E e;
    
    public GenericR(Connection conn,E e) { 
        this.conn = conn; 
        this.e = e;
    }
    @Override public void save(E e) {
        if(e==null) return;
        try{
            String query="insert into "+e
                .getClass()
                .getMethod("getTable", null).invoke(e, null)+" (";
            Field[] campos=e.getClass().getDeclaredFields();
            for(int a=1;a<campos.length;a++){
                if(a!=1) query+=",";
                query+=campos[a].getName();
            }
            query+=") values (";
            for(int a=1;a<campos.length;a++){
                if(a!=1) query+=",";
                query+="?";
            }
            query+=")";
            //System.out.println(query);
            try (PreparedStatement ps=conn.prepareStatement(
                    query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                for(int a=1;a<campos.length;a++){
                    String method="get"
                            +campos[a].getName().substring(0,1).toUpperCase()
                            +campos[a].getName().substring(1);
                    //System.out.println(method);
                    ps.setObject(a, e.getClass().getMethod(method, null).invoke(e, null));
                }
                ps.execute();
                ResultSet rs=ps.getGeneratedKeys();
                String method="set"
                        +campos[0].getName().substring(0,1).toUpperCase()
                        +campos[0].getName().substring(1);
                if(rs.next()) e
                        .getClass()
                        .getMethod(method, Integer.class)
                        .invoke(e,rs.getInt(1));
            } catch (Exception ex2) { ex2.printStackTrace(); }
        }catch(Exception ex){ ex.printStackTrace(); }
    }
    @Override public void remove(E e) {
        if(e==null) return;
        try {
            String query="delete from "
                    +e.getClass().getMethod("getTable",null).invoke(e,null)
                    +" where codigo=?";
            //System.out.println(query);
            try(PreparedStatement ps=conn.prepareStatement(query)){
                int id=Integer.parseInt(
                        e.getClass()
                                .getMethod("getCodigo",null).invoke(e,null)+"");
                ps.setInt(1, id);
                ps.execute();
            } catch (Exception ex2) { ex2.printStackTrace(); }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    @Override public void update(E e) {
        if(e==null) return;  
        try {
            String query="update "+e
                    .getClass()
                    .getMethod("getTable", null)
                    .invoke(e, null)+" set ";
            Field[] campos=e.getClass().getDeclaredFields();
            for(int a=1;a<campos.length;a++){
                if(a!=1) query+=", ";
                query+=campos[a].getName()+"=?";
            }
            query+=" where codigo=?";
            try (PreparedStatement ps=conn.prepareStatement(query)) {
                for(int a=1;a<campos.length;a++){
                    String method="get"
                            +campos[a].getName().substring(0,1).toUpperCase()
                            +campos[a].getName().substring(1);
                    //System.out.println(method);
                    ps.setObject(a, e.getClass().getMethod(method, null).invoke(e, null));
                }
                ps.setInt(campos.length, Integer.parseInt(e
                        .getClass()
                        .getMethod("getCodigo", null)
                        .invoke(e, null)+""));
                ps.execute();
            } catch (Exception ex2) { ex2.printStackTrace(); }
            System.out.println(query);
            
        }catch(Exception ex){ ex.printStackTrace(); }
    }
    @Override public List<E> getAll() {
        List<E> lista=new ArrayList();
        try {
            String query="select * from "
                    +e.getClass().getMethod("getTable",null).invoke(e,null);
            Field[] campos=e.getClass().getDeclaredFields();
            try (ResultSet rs=conn.createStatement().executeQuery(query)) {
                ResultSetMetaData rsmd=rs.getMetaData();
                int cantidad=rsmd.getColumnCount();
                while(rs.next()){
                    E x=(E) e.getClass()
                            .getConstructor().newInstance();
                    for(int a=1;a<=cantidad;a++){
                        String field=rsmd.getColumnName(a);
                        String method="set"+field.substring(0, 1)
                                .toUpperCase()+field.substring(1);
                        //System.out.println(rsmd.getColumnName(a)+" "
                        //        +rsmd.getColumnTypeName(a));
                        if(rsmd.getColumnTypeName(a).equals("INT"))
                            e.getClass().getMethod(method, Integer.class)
                                    .invoke(x, rs.getInt(field));
                        if(rsmd.getColumnTypeName(a).equals("VARCHAR"))
                            e.getClass().getMethod(method, String.class)
                                    .invoke(x, rs.getString(field));
                        if(rsmd.getColumnTypeName(a).equals("CHAR"))
                            e.getClass().getMethod(method, String.class)
                                    .invoke(x, rs.getString(field));
                    }
                    
                    lista.add(x);
                }
            } catch (Exception ex2) { ex2.printStackTrace(); }
        } catch (Exception ex) { ex.printStackTrace(); }
        return lista;
    }
    
}