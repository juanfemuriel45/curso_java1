package test;

import static manejoarchivos.manejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);
//          anexarArchivo(nombreArchivo, "Hola Felipe, desde Java");
//          anexarArchivo(nombreArchivo, "Hola Juan felipe 2");
        leerArchivo(nombreArchivo);
    }
}
