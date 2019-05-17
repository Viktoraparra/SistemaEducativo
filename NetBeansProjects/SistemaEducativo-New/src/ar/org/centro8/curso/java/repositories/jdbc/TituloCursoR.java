package ar.org.centro8.curso.java.repositories.jdbc;
import ar.org.centro8.curso.java.entities.TituloCurso;
import ar.org.centro8.curso.java.repositories.interfaces.I_TituloCursoR;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TituloCursoR implements I_TituloCursoR{
    private GenericR<TituloCurso>titu;
        static Statement sentencia;    
    static ResultSet resultado;
        

    public TituloCursoR(Connection conn) { titu=new GenericR(conn,new TituloCurso());   }
    
    
    @Override 
    public void save(TituloCurso tituloCurso)   { titu.save(tituloCurso);     }
    @Override 
    public void remove(TituloCurso tituloCurso) { titu.remove(tituloCurso);   }
    @Override 
    public void update(TituloCurso tituloCurso) { titu.update(tituloCurso);   }
    @Override 
    public List<TituloCurso> getAll()           { return titu.getAll();       }

    @Override
    public TituloCurso getByCodigu(int codigo) {
         List<TituloCurso> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==codigo)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<TituloCurso> getLikeTitulo(String titulo) {
        return getAll()
                .stream()
                .filter(a->a.getTitulo().toLowerCase()
                        .contains(titulo.toLowerCase()))
                        .collect(Collectors.toList());
    }

 
    public static ArrayList<String> fillCmb(){
//        se realiza la lista de los titulos de cursos
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT titulo FROM titulocurso";
        try { resultado = sentencia.executeQuery(q);
        } catch (Exception e) { e.printStackTrace();}
        try { while(resultado.next())
            { lista.add(resultado.getString("titulo")); }
        } catch (Exception e) { e.printStackTrace(); }
        return lista; 
        }
}
