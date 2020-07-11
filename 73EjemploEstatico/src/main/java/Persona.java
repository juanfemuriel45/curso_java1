
public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    /*   Ya se esta aculizando e incrementando
    public void setIdPersona(int idPersona){
        this.idPersona=idPersona;
    }
     */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    
    @Override
    public String toString(){
         return "IdPersona: "+ idPersona + ", nombre:  " + nombre + ",contadorPersonas: " + contadorPersonas;
    }
}
