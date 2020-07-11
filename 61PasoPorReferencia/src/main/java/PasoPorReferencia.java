
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.cambiarNombre("Juan");
        System.out.println("el nombre es: "+ persona.obtenerNombre());
        
        modificarPersona(persona);
        System.out.println("el nombre nuevo es: "+ persona.obtenerNombre());
    }

    private static void modificarPersona(Persona arg) {
        arg.cambiarNombre("carlos");
    }
}