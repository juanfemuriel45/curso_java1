package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
    //Realizando select de la tabla personas
        PersonaDAO personaDAO = new PersonaDAO();
                
//    //insertando un nuevo registro en la base de datos
//        Persona personaNueva = new Persona("Elizabeth", "Ruiz", "eliza@gmail.com", "12345");
//        System.out.println("Registros Insertados: " + personaDAO.insertar(personaNueva));
        
    //Eliminando un registro en la base de datos
        Persona personaEliminada = new Persona(1);
        System.out.println("id_persona del Registro eliminado: " + personaDAO.eliminar(personaEliminada));

//     //modificar un objeto en la base de datos
//     Persona personaModificar = new Persona(1, "juan", "muriel", "correo2", "cel2");
//     personaDAO.actualizar(personaModificar);
        
    //mostrar listado de personas
    List<Persona> personas = personaDAO.seleccionar();
     personas.forEach((persona) -> {
            System.out.println("persona = " + persona);
        });
    }
}
