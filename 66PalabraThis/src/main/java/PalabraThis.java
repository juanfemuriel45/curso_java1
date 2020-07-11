
public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("Fel ipe");
    }
}

class Persona {

    String nombre;

    //constructor
    Persona(String nombre) {
        this.nombre = nombre;// this apunta a  objeto tipo persona
        System.out.println("Impresion del operador This dentro de la clase persona: " + this);

        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); // contiene referencia al objeto persona
    }
}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("Impresion de la variable p: " + p);
        System.out.println("Impresion del objeto actual (this): " + this);
        //ahora this apunta a objeto tipo imprimir
    }
}
