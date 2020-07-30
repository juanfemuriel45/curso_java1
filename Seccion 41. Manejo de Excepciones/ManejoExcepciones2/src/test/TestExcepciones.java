package test;

import static aritmetica.Aritmetica.division;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        
/* De esta forma se va a producir la ruptura abrupta de nuestro programa, pero la idea es 
mostrar la diferencia entre Exeption y RuntimeException */
        
        resultado = division(10, 0);

        System.out.println("Ocurrio un Error");

        System.out.println("Resultado: " + resultado);
    }
}
