package ar.org.centro8.curso.java.repositories.jdbc;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.enumerados.Dias;
import ar.org.centro8.curso.java.enumerados.Turnos;
import ar.org.centro8.curso.java.repositories.interfaces.I_CursoR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class CursoR implements I_CursoR{
    private GenericR<Curso>cur;
     public CursoR(Connection conn){ cur=new GenericR(conn,new Curso());  }
    @Override public void save(Curso curso)   { cur.save(curso);     }
    @Override public void remove(Curso curso) { cur.remove(curso);   }
    @Override public void update(Curso curso) { cur.update(curso);   }
    @Override public List<Curso> getAll()     { return cur.getAll(); }

    @Override
    public Curso getByCodigo(int codigo) {
            List<Curso> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==codigo)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Curso> getLikeProfesor(String profesor) {
        return getAll()
                .stream()
                .filter(a->a.getProfesor().toLowerCase()
                        .contains(profesor.toLowerCase()))
                        .collect(Collectors.toList());
    }

    @Override
    public List<Curso> getLikeTituloProfesorDiaTurno(Integer codigoTitulo, String profesor, Dias dia, Turnos turno) {
         return getAll()
                .stream()
                .filter(a->a.getCodigoTitulo().toString().contains(codigoTitulo.toString())
                && a.getProfesor().toLowerCase().contains(profesor.toLowerCase())
                && a.getDia().equalsIgnoreCase(dia.toString()) 
                && a.getTurno().equalsIgnoreCase(turno.toString()))
                .collect(Collectors.toList());
         
         
    }
    
}
