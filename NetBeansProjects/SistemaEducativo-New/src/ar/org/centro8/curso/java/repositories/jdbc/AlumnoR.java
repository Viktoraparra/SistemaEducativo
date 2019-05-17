package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entities.Alumno;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.repositories.interfaces.I_AlumnoR;
import ar.org.centro8.curso.java.repositories.interfaces.I_GenericR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class AlumnoR implements I_AlumnoR{
    private I_GenericR<Alumno> al;
    public AlumnoR(Connection conn)
    { al= new GenericR(conn, new Alumno()); }

    @Override public void save(Alumno alumno)   { al.save(alumno);    }
    @Override public void remove(Alumno alumno) { al.remove(alumno);  }
    @Override public void update(Alumno alumno) { al.update(alumno);  }
    @Override public List<Alumno> getAll()      { return al.getAll(); }

    @Override
    public Alumno getByCodigo(int codigo) {
        List<Alumno> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==codigo)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Alumno> getByApellido(String apellido) {
        return getAll()
                .stream()
                .filter(a->a.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }

    @Override
    public List<Alumno> getLikeApellidoNombre(String apellido, String nombre) {
       return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase())
                || a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override public List<Alumno> getByCurso(Curso curso) 
    { return getByCurso(curso.getCodigo());}

    @Override
    public List<Alumno> getByCurso(int codigoCurso) {
        return getAll()
                .stream()
                .filter(a->a.getCodigoCurso()==codigoCurso)
                .collect(Collectors.toList());
    }

}
