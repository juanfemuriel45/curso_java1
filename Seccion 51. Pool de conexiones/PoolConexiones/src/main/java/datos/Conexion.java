package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "test";
    private static final String JDBC_PASSWORD= "";
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        
        //Definimos el tamaño inicial del pool de conexiones
        ds.setInitialSize(5);
        return ds;
    }
    
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
       conn.close(); 
    }
}
 