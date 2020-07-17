
public class PalabraReturnClases {

    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
         /* se asocia el objeto de tipo Suma a la variable s de tipo Suma
        pero no es necesario... pero se agrego para ver el retorno de un objeto 
        en la clase Crear objeto*/
         
        System.out.println("Resultado de llamar el metodo sumar: " + s.sumar());
    } 
    
    private static Suma creaObjetoSuma (){//metodo que crea el objeto de tipo Suma
        Suma suma = new Suma(4,6);
        return suma;  
    }
}


class Suma{
    //de declaran los atributos
    int a;
    int b;
    
    public Suma(int a,int b){ // se crea metodo que guarde los numeros pasados
        this.a=a;
        this.b=b;
    }
    
    public int sumar(){//este metodo realiza la suma devuelve el resultado
        return this.a+this.b;
    }
}