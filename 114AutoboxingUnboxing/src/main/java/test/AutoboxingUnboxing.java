
package test;

/**
 * 
 * @author juanfelipemurielvalencia
 */
public class AutoboxingUnboxing {
    public static void main(String[] args) {
         //autboxing (envolvemos tipos primitivos en clases wrapper)
         Integer enteroObj = 10;
         System.out.println("enteroObj : "  + enteroObj);// impresion normal
         
         //Unboxing (extraemos tipo primitivo del objeto envolvente)
         int entero = enteroObj;
         System.out.println("entero: " + entero);
         
         Float floatObj = 15.4f; //Autoboxing
         System.out.println("floatObj : " + floatObj);
         float flotante = floatObj; //Unboxing
         System.out.println("flotante " + flotante);
         
         //Solicitar un tipo int a un objetivo de la clase Float (object)
         System.out.println("int a partir de un Float: "  + floatObj.intValue() );
         
    }
}  
 