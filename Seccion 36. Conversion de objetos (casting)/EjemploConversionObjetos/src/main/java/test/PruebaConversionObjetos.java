package test;

import ejemploconversionesobjetos.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class PruebaConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //empleado.getTipoDeEscrituraEnTexto;       no se puede

        System.out.println(empleado.obtenerDetalles());
        Escritor escritor = (Escritor) empleado;

        escritor.getTipoEscrituraEnTexto();

        //conversion al vuelo
        System.out.println(((Escritor) empleado).getTipoEscrituraEnTexto());

        empleado = new Gerente("Laura", 6000, "Sistemas");

        System.out.println(((Gerente) empleado).getDepartamento());
    }
}
