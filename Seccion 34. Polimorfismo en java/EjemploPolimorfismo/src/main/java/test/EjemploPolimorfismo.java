
package test;

import EjemploPolimorfismo.Empleado;
import EjemploPolimorfismo.Gerente;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        imprimirDetalles(empleado);
        Gerente gerente = new Gerente ("Karla", 2000, "Finanzas");
        imprimirDetalles(gerente);

    }
    
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
}
