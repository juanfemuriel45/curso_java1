
public class PasoPorValor {

    public static void main(String[] args) {
        
        var x=10;
        System.out.println("la variable x:" + x);
        
        cambiarValor(x);
        System.out.println("la variable x2:" + x);

    }

    private static void cambiarValor(int arg) {
        arg =20;
        System.out.println("variable arg:" + arg);
    }
}
