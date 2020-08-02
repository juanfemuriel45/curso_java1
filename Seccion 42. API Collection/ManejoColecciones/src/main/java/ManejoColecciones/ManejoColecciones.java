package ManejoColecciones;

import java.util.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class ManejoColecciones {

    public static void main(String[] args) {
        //List es una interface
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(3);
        
        imprimir(miLista);

        //Set es una interfaz y HashSet es una clase de ella
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");

        imprimir(miSet);
        
        //Map es una interface y HashMap es una clase de ella
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("Valor2", "Felipe");
        miMapa.put("Valor3", "Muriel");
        miMapa.put("Valor3", "Valencia");

        //Imprimir la llave
        imprimir(miMapa.keySet());
        //Imprimir el valor
        imprimir(miMapa.values());
    }

    //Collection es una interface
    private static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println(" ");
    }
}
