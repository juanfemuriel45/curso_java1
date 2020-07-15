
package test;

import EjemploSobreescritura.Empleado;
import EjemploSobreescritura.Gerente;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class EjemploSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println("Empleado: " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente ("Karla", 2000, "Finanzas");
        System.out.println("Gerente: " + gerente.obtenerDetalles());
    }
}
