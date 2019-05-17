package ar.org.centro8.curso.java.utils.swing;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Table<E>{
    public void cargar(JTable tbl, List<E> lista){
        if(tbl==null) return;
        tbl.setModel(new DefaultTableModel());
        if(lista==null || lista.isEmpty()) return;
        E e=lista.get(0);
        Field[] campos=e.getClass().getDeclaredFields();
        DefaultTableModel modelo=new DefaultTableModel();
        for(Field f:campos) modelo.addColumn(f.getName());
        for(int a=0;a<lista.size();a++){
            e=lista.get(a);
            Object[] vectorFila=new Object[campos.length];
            for(int f=0;f<campos.length;f++){
                try{
                    Method method=e
                        .getClass()
                        .getMethod("get"
                                +campos[f].getName().substring(0,1).toUpperCase()
                                +campos[f]
                                        .getName()
                                        .substring(1, campos[f].getName().length())
                                , null);
                    vectorFila[f]=method.invoke(e, null);
                }catch(Exception ex) {
                    System.out.println(ex);
                }
            }
            modelo.addRow(vectorFila);
        }
        tbl.setModel(modelo);
    }
}