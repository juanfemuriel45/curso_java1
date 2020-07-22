
package ejemploconversionesobjetos;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
        
    }
    
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo Escritura: " + this.tipoEscritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura(){
         return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto(){
         return this.tipoEscritura.getDescripcion();
    }
}
