/*
* Derechos reservados para Juan Felipe Muriel Valencia
*/
package prueba;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de java doc
 * @version 1.0
 * @author juanfelipemurielvalencia
 */
public class PruebaJavaDoc {
    
    /**
     * Metodo que ejecuta la prueba de la clase aritmetica
     * @param args es un array de tipo String del cli
     */
    
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(3, 2);
        int resultado = aritmetica1.sumar();
        System.out.println("resultado de la suma es: " +resultado);
    }
        
    
}
