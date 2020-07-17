package matrices;

public class EjemploMatricesprueba {

    public static void main(String[] args) {
        //1. Declaramos matriz
        int edades[][];
        
        //2. Instanciamos la matriz de int
        edades = new int [3][2];
        
        //3. Instanciar valores en la matrix
        edades [0][0] = 30;
        edades [0][1] = 15;
        edades [1][0] = 20;
        edades [1][1] = 45;
        edades [2][0] = 5;
        edades [2][1] = 38;
        
        //4. Imprimir algunos valores
        System.out.println("Matrix edades 0 0 : " + edades [0][0]);
        System.out.println("Matrix edades 2 1 : " + edades [2][1]);
        
        //1. Declarar, instanciar matrix de objetos tipo persoan
        Persona personas [][]= new Persona [3][3];
        
        //2. inicializar valores
        personas [0][0] = new Persona("Juan");
        personas [0][1] = new Persona("Karla");
        
        //3. imprimimos valores
        System.out.println("Matriz persona en indice 0 0 : " + personas[0][0]);
        System.out.println("Matriz persona en indice 0 1 : " + personas[0][1]);
        
        for (int renglon=0; renglon < personas.length; renglon ++){
            for (int columna=0; columna < personas[renglon].length; columna++){
               System.out.println("Matriz persona en indice " + renglon +"-"+ columna + personas[renglon][columna]); 
            }
        }
    }

}
