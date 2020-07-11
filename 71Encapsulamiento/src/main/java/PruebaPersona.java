
public class PruebaPersona {

    public static void main(String[] args) {
        //se crea la variable persona de tipo Persona y se asignan los valores
        Persona persona = new Persona("Juan", 5000, false);

        System.out.println(persona);

        //se cambian usando metodos set de la clase Persona
        persona.setNombre("Felipe");
        persona.setSueldo(3000);
        persona.setEliminado(true);
        //se imprimen de nuevo

        System.out.println(persona);

    }
}
