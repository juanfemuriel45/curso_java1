package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuarioNuevo = new Usuario();
            usuarioNuevo.setUsuario("Juannuevo");
            usuarioNuevo.setPassword("newpass");
            usuarioDAO.insertar(usuarioNuevo);
            
            
            Usuario usuarioModificar = new Usuario();
            usuarioModificar.setId_usuario(1);
            usuarioModificar.setUsuario("new user");
            usuarioModificar.setPassword("New password");
            usuarioDAO.actualizar(usuarioModificar);
            
            
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
