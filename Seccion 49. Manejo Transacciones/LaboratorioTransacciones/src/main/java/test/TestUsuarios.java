package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        
//        //select de la tabla usuarios
//        usuarios.forEach((usuario) -> {
//            System.out.println("usuario = " + usuario);
//        });
        
        //update
        Usuario usuarioActualizar = new Usuario(1, "juann", "juann");
        System.out.println("Usuario actualizado: " + usuarioDAO.actualizar(usuarioActualizar));
        
//        //insert
//        Usuario usuarioNuevo = new Usuario("juan4", "juan4p");
//        System.out.println("# Usuarios insertados: "+ usuarioDAO.insertar(usuarioNuevo));        
    }
}
