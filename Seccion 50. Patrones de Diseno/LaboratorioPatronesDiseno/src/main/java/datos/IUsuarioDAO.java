package datos;

import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public interface IUsuarioDAO {
    
    public List<UsuarioDTO> seleccionar() throws SQLException;
    
    public int insertar(UsuarioDTO usuario) throws SQLException;
    
    public int actualizar(UsuarioDTO usuario) throws SQLException;
    
    public int borrar(UsuarioDTO usuario) throws SQLException;
}