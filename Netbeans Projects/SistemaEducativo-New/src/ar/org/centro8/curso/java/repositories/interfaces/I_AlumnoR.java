package ar.org.centro8.curso.java.repositories.interfaces;
import ar.org.centro8.curso.java.entities.Alumno;
import ar.org.centro8.curso.java.entities.Curso;
import java.util.List;
public interface I_AlumnoR {
   void save(Alumno alumno); 
   void remove(Alumno alumno);
   void update(Alumno alumno);
   List<Alumno>getAll();
   Alumno getByCodigo(int codigo);
   List<Alumno>getByApellido(String apellido);
   List<Alumno>getLikeApellidoNombre(String apellido,String nombre);
   List<Alumno>getByCurso(Curso curso);
   List<Alumno>getByCurso(int codigoCurso);
}
