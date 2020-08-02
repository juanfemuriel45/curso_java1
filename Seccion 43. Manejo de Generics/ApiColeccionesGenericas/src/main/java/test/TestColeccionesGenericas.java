package test;

import java.util.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        //List es una interface
        List<String> miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        
        String elemento = miLista.get(0);
        //System.out.println("Elemento: " + elemento);
        imprimir(miLista);

        //Set es una interfaz y HashSet es una clase de ella
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");

        imprimir(miSet);
        
        //Map es una interface y HashMap es una clase de ella
        Map <String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("Valor2", "Felipe");
        miMapa.put("Valor3", "Muriel");
        miMapa.put("Valor3", "Valencia");
        
        String elementoMapa = miMapa.get("valor1");
        System.out.println("Elemento Mapa = " + elementoMapa);
        
        //Imprimir la llave
        imprimir(miMapa.keySet());
        //Imprimir el valor
        imprimir(miMapa.values());
    }

    //Collection es una interface
    private static void imprimir(Collection<String> coleccion) {
        
//        coleccion.forEach(elemento -> {
//            System.out.println("Elemento: " + elemento);
//        });
//       
        
        for (String elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println(" "); 
    }
}
