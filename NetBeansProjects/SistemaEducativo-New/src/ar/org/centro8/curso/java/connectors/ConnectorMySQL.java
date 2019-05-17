package ar.org.centro8.curso.java.connectors;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectorMySQL {
    
    // hago la configuracion de los drivers a utilizar para la conexion
    private static String driver="com.mysql.cj.jdbc.Driver";
    // determino la url, junto al puerto y a la base a conectar
    private static String url="jdbc:mysql://localhost:3306/colegio2"+"?useTimezone=true&serverTimezone=UTC";
    // le indico el nombre de usuario
    private static String user="root";
    //Determino la clave a utilizar
    private static String pass="root";
    //Determino la conexion a realizar inicializandola en null
    private static Connection conn=null;
    
    // elaboro la funcion que realizara la conecxion
    // determinando que haga las verificaciones para establecer
    // una conexion unica a la base de dato 
    // continua e intermitente
    
    public synchronized static Connection getConnection(){
        if (conn==null) {
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
            } catch (Exception ex) { ex.printStackTrace(); }
        }
        return conn;
    }
}
