
package test;

import domain.Persona;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Juan");
        persona.setApellido("Muriel");
        
        System.out.println(persona);
        System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        
    }
}
