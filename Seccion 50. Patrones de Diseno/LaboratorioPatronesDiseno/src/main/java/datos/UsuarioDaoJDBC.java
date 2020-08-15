package datos;

import static datos.Conexion.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class UsuarioDaoJDBC implements IUsuarioDAO{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuarios";
    private static final String SQL_INSERT = "INSERT INTO usuarios (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET usuario = ?, password = ? WHERE id_usuario = ?";

    
    public UsuarioDaoJDBC(){
        
    }
    
    public UsuarioDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
   
    @Override
    public List<UsuarioDTO> seleccionar() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario2 = rs.getString("usuario");
                String password = rs.getString("password");

                usuario = new UsuarioDTO(idUsuario, usuario2, password);
                usuarios.add(usuario);
            }
            
        } finally {
            try {
                close(rs);
                close(stmt);

                if (conexionTransaccional == null) {
                    close(conn);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return usuarios;
    }

    public int insertar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                if (conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }

    public int actualizar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                if (conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }

 
    @Override
    public int borrar(UsuarioDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
