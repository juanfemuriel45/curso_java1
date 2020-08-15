
package datos;

import domain.Persona;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public interface IPersonaDAO {
    public List<Persona> seleccionar() throws SQLException;
    public int insertar(Persona persona) throws SQLException;
    public int actualizar(Persona persona) throws SQLException;
    public int eliminar(Persona persona) throws SQLException;
}
