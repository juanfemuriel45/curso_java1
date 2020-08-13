package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuarios";
    private static final String SQL_INSERT = "INSERT INTO usuarios (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario2 = rs.getString("usuario");
                String password = rs.getString("password");

                usuario = new Usuario(idUsuario, usuario2, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return usuarios;
    }
    
    public int insertar(Usuario usuario){
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        int registros= 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario()) ;
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
    
    public int actualizar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros= 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
}
