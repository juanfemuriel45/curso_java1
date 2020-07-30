package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        /* De esta forma se va a producir la ruptura abrupta de nuestro programa, pero la idea es 
mostrar la diferencia entre Exeption y RuntimeException */
        try {
            resultado = division(10, 0);

        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo operacion excepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrio un Error");
            System.out.println(e.getMessage());
        } //finally significa que siempre se va a realizar lo siguiente, con o sin excepcion
        finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("Resultado: " + resultado);
    }
}
