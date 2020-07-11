
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    //constructor vacio
    private Persona(){
        this.idPersona= ++contadorPersonas;
    }
    
    //constructor completo
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad= edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }
}
