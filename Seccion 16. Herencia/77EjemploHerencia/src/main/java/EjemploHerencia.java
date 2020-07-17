
import java.util.Date;

public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        empleado1.setEdad(21);
        empleado1.setGenero('M');
        empleado1.setDireccion("ciudad 2000");
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Karla");
        cliente1.setGenero('F');
        cliente1.setEdad(17);
        cliente1.setDireccion("El diamante");
        System.out.println(cliente1);

    }
}
