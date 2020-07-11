package paquete1;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Clase1 {

    //Definimos atributos
    public String atributoPublico = "Valor atributo publico ";
    //Definimos atributo Protegido
    protected String atributoProtegido = "Valor atributo Protegido";
    //Definimos atributo Default
    String atributoDefault = "Valor atributo Default";
    //Definimos atributo privado
    private String atributoPrivado = "Valor Atributo privado";

    public Clase1() {
        System.out.println("Constructor publico vacio");
    }

    public Clase1( String texto) {
        System.out.println("Constructor publico con un argumento: " + texto);
    }
    
    protected Clase1(String texto, String texto2){
        System.out.println("Constructor protected con dos argumentos: " + texto + " " + texto2);
    }
    
    Clase1(String texto, String texto2, String texto3){
        System.out.println("Constructor Default o Package");
    }
    private Clase1(String texto, String texto2,String texto3, String texto4) {
        System.out.println("Constructor privado");
    }
    
    //metodos de la clase
    public String metodoPublico(){
        return "Metodo publico";
    }
    
    protected String metodoProtegido(){
        return "Metodo Protegido";
    }
    
    String metodoDefault(){
        return "Metodo default o package";
    }
    
    private String metodoPrivado(){
        return "Metodo Privado";
    }
    
}
