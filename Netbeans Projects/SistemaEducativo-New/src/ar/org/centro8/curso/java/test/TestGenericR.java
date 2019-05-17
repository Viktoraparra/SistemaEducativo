package ar.org.centro8.curso.java.test;
import ar.org.centro8.curso.java.connectors.ConnectorMySQL;
import ar.org.centro8.curso.java.entities.Alumno;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.entities.TituloCurso;
import ar.org.centro8.curso.java.enumerados.Dias;
import ar.org.centro8.curso.java.enumerados.Turnos;
import ar.org.centro8.curso.java.repositories.jdbc.GenericR;
public class TestGenericR {
    public static void main(String[] args) {
        GenericR<TituloCurso> titu= new GenericR(ConnectorMySQL.getConnection(), 
                new TituloCurso());
        TituloCurso tituCurso = new TituloCurso("JavaScript", 3, "Sala de 24 computadores.");
        titu.save(tituCurso);
        System.out.println(tituCurso);
    
        GenericR<Alumno>ar=new GenericR(ConnectorMySQL.getConnection(),new Alumno());
        Alumno alumno=new Alumno("Valentin", "Gomez", 34, 1);
        ar.save(alumno);
        System.out.println(alumno);
    
      
    }
}
