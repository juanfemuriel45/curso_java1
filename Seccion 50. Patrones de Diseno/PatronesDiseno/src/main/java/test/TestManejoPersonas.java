package test;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaJdbcDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;

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
            
            // se usa la interface
             IPersonaDAO personaJdbcDao = new PersonaJdbcDAO(conexion);
             List<Persona> personas = personaJdbcDao.seleccionar();
             
             for(Persona persona : personas){
                 System.out.println("persona : " + persona);
             }
             
             conexion.commit();
             System.out.println("Se ha hecho commit");
             
             
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
