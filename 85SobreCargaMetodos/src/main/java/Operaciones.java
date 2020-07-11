
public class Operaciones {
    //Metodo de sumar
    public static int sumar(int a, int b){
        System.out.println("Metodo sumar con argumentos tipo int");
        return a+b;
    }
    
    //sobrecarga del metodo sumar
    public static double sumar(double a, double b){        
        System.out.println("Metodo sumar con argumentos tipo double");
        return a+b;
    }
    
     //sobrecarga del metodo sumar
    public static double sumar(int a, double b){        
        System.out.println("Metodo sumar con argumentos tipo int - double");
        return a+b;
    }
    
     //sobrecarga del metodo sumar
    public static double sumar(double a, int b){        
        System.out.println("Metodo sumar con argumentos tipo double - int");
        return a+b;
    }
}
