package test;

import java.sql.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestMysqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicKeyRetrieval=true";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"test", "");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM personas";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()){
                System.out.print("Id persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
                    
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
