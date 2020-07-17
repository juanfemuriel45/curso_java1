package EjemploInstanceOf;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobre escribimos el metodo padre heredado
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()
                + ", Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
