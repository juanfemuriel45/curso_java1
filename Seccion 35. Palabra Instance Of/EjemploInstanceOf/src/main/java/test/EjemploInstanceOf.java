package test;

import EjemploInstanceOf.Empleado;
import EjemploInstanceOf.Gerente;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class EjemploInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        determinaTipo(empleado);
        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        determinaTipo(gerente);

    }

    public static void determinaTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            System.out.println("Departamento del gerente: " + gerente.getDepartamento());
            //System.out.println("Departamento: " + ((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Nombre del empleado: " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("object: " + empleado.toString());
        }
    }
}
