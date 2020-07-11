package mundopc;

import com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        //creamos objetos tipo computadora
        Monitor monitor = new Monitor("LG", 15.0);
        DispositivoEntrada dispositivoEntrada= new DispositivoEntrada ("USB", "LENOVO"); 
        Teclado teclado = new Teclado("Teclado", "Genius");
        Raton raton = new Raton("Mouse", "Microsoft");
        Computadora compuadora1 = new Computadora("Apple", monitor, teclado, raton);
        
        //creamos la orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuadora1);
        
        //imprimimos a orden
        orden1.mostrarOrden();
    }
}
