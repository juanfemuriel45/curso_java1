package paquete2;

import paquete1.Clase1;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Clase3 extends Clase1 {
    public Clase3(){
        /*Se puede utilizar un constructor de una clase madre que tiene un modificador de 
        acceso protected o default con la palabra super */
        super("gatos", "perros");
        
        //Prueba de constructores de la clase 1
        new Clase1();//llamada al constructor publico
        //new Clase1("uno", "dos");//llamada al contructor protected
        //new Clase1("a", "b", "c");//llamada al constructor default o package
        
        //No podemos llamar a constructores privados desde otras clases
        //new Clase1("a", "b", "c", "d")// llamada al constructor private
    }
    
    //Prueba de los metodos
    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico de la clase1: " + c1.atributoPublico);
        
        //Para acceder a un metodo protected de la clase padre, no se usa la referencia del objeto
        //System.out.println("atributo protegido de la clase1: " + c1.atributoProtegido);
        System.out.println("atributo protegido de la clase1: " + atributoProtegido);
        
        /*Los metodos de la clase padre que son default o package no se pueden acceder desde
        otro paquete */
        //System.out.println("atributo default de la clase1: "+ c1.atributoDefault );
        
        //System.out.println("atributo privado de la clase1: " + c1.atributoPrivado);
        
        System.out.println(" ");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + metodoProtegido());
        
        //No se puede acceder a este metodo debido a que esta clase esta en otro paquete
        //System.out.println("Metodo default: " + c1.metodoDefault());
        
        //System.out.println("Metodo private: " + c1.metodoPrivado());
    } 
    
    public static void main(String[] args) {
        Clase3 c2 = new Clase3();
        c2.pruebaDesdeClase3(); 
    }
}
