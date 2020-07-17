
package arreglos;

public class EjemploArreglos {
    
    public static void main(String[] args) {
        //1. Declarar variable de tipo int
        int edades [];
        
        //2. instanciar arreglo de tipo int
        edades = new int[3];
        
        //3. inicializar valores del arreglo
        edades [0] = 30;
        edades [1] = 15;
        edades [2] = 20;
        
        //imprimir valores del arreglo
        System.out.println("Arreglo de enteros 0: " + edades[0]);
        System.out.println("Arreglo de enteros 1: " + edades[1]);
        System.out.println("Arreglo de enteros 2: " + edades[2]);
        
        //declarar e instanciar arreglo tipo oject
        Persona personas[] = new Persona[4];
        //inicializar valores de los arreglos
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        
        System.out.println("Arreglo personas en indice 0: " + personas[0]);
        System.out.println("Arreglo personas en indice 1: " + personas[1]);
        System.out.println("Arreglo personas en indice 2: " + personas[2]);
        System.out.println("Arreglo personas en indice 3: " + personas[3]);
        
        //arreglo utilizado notacion simplificada
        String nombres[] = {"Juan", "Felipe", "Muriel", "Valencia"};
        //imprimir con ciclo for
        for (int i=0; i<=nombres.length-1; i++){
            System.out.println("Arreglo String indice: " + i + ": " + nombres[i]);
        }
    }
}
