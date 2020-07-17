
package paquete1;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Clase2 {
    public Clase2(){
        //Prueba de constructores de la clase 1
        new Clase1();//llamada al constructor publico
        new Clase1("uno", "dos");//llamada al contructor protected
        new Clase1("a", "b", "c");//llamada al constructor default o package
        
        //No podemos llamar a constructores privados desde otras clases
        //new Clase1("a", "b", "c", "d")// llamada al constructor private
    }
    
    //Prueba de los metodos
    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico de la clase1: " + c1.atributoPublico);
        System.out.println("atributo protegido de la clase1: " + c1.atributoProtegido);
        System.out.println("atributo default de la clase1: "+ c1.atributoDefault );
        //System.out.println("atributo privado de la clase1: " + c1.atributoPrivado);
        
        System.out.println(" ");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtegido());
        System.out.println("Metodo default: " + c1.metodoDefault());
        //System.out.println("Metodo private: " + c1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2(); 
    }
}
