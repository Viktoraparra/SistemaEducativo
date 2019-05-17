package ar.org.centro8.curso.java.test;
import ar.org.centro8.curso.java.connectors.ConnectorMySQL;
import java.sql.Connection;
import java.sql.Statement;
public class TestConnector {
    public static void main(String[] args) throws Exception{
        Connection conn = ConnectorMySQL.getConnection();
        Statement st = conn.createStatement();
//      String query ="insert into cursos (titulo,profesor,dia,turno) values "
//               + "('Java','Gomez','lunes','tarde')";
//       st.execute(query);
//        
        ConnectorMySQL
                .getConnection()
                .createStatement()
                .execute("insert into titulocurso (titulo,duracion,requerimientos) values "
                                + "('MySQL','210','Salon de computadoras')"
                );
//        ConnectorMySQL
//                .getConnection()
//                .createStatement()
//                .execute("insert into cursos (codigoTitulo,titulo,profesor,dia,turno) values "
//                                + "(1,'MySQL','Gabriel Mendez','LUNES','MAÑANA')"
//                );
//        ConnectorMySQL
//                .getConnection()
//                .createStatement()
//                .execute("insert into alumnos (nombre,apellido,edad,codigoCurso) values "
//                                + "('Victor','Parra',34,1)"
//                );
   }
    
}
