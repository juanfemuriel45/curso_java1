package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
             PersonaDAO personaDAO = new PersonaDAO();
             
             Persona cambioPersona = new Persona();
             cambioPersona.setIdPersona(2);
             cambioPersona.setNombre("Jessica");
             cambioPersona.setApellido("muriel");
             cambioPersona.setEmail("nuevoemail@mail.com");
             cambioPersona.setTelefono("234");
             personaDAO.actualizar(cambioPersona);
             
             
             Persona nuevaPersona = new Persona();
             nuevaPersona.setNombre("fernando");
             nuevaPersona.setApellido("Lozada");
             nuevaPersona.setEmail("email@mail.com");
             nuevaPersona.setTelefono("322");
             personaDAO.insertar(nuevaPersona);
             
             conexion.commit();
             
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }    
    } 
}
