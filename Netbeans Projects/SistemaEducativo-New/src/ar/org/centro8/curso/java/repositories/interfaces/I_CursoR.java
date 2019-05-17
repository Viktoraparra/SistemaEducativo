package ar.org.centro8.curso.java.repositories.interfaces;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.enumerados.Dias;
import ar.org.centro8.curso.java.enumerados.Turnos;
import java.util.List;
public interface I_CursoR {
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    List<Curso>getAll();
    Curso getByCodigo(int codigo);
    
//    Modificar get like por profesor en la tabla 
//            curso no hace la busqueda ni por curso ni por profesor
    List<Curso>getLikeProfesor(String profesor);
    List<Curso>getLikeTituloProfesorDiaTurno(Integer codigoTitulo,String profesor,
            Dias dia,Turnos turno);
}
