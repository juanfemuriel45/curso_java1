
public class Persona {
    String nombre;
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    //modificamos el atributo nombre de la clase
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}
