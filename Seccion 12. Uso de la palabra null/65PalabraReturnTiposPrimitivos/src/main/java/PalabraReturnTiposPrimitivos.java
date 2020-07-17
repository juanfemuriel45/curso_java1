
public class PalabraReturnTiposPrimitivos {
    
    public static void main(String[] args) {
        sumarSinRetornarValor(3,6);
    }
    
    //no regresa valores, solo imprime la suma
    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("Resultado de sumar sin retornar valor: " + (a+b));
        //return; //es opcional la palabra return
    }
    
}
