package test;

 import static aritmetica.Aritmetica.division;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{ 
            resultado = division(10, 0);
        }catch(Exception e){
            System.out.println("Ocurrio un Error");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());          
        }
                
        System.out.println("Resultado: " + resultado); 
    }
}
