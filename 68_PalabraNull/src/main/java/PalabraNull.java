
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Felipe");
        System.out.println("El nombre es (persona1): " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("Persona 2: " + persona2.obtenerNombre());

        persona1 = null;
        
        //se valida para que no salga el error nullPointerException
        if (persona1 != null) {
            System.out.println("El nombre es (persona1): " + persona1.obtenerNombre());
        } else {
            System.out.println("No apunta a ningun objeto");
        }
    }
}

/**
 * *****************************************************************************
 */
class Persona {

    String nombre;

    //constructor
    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
