package ManejoInterfaces;

import datos.*;

public class ManejoInterfaces {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        imprimir(datos);

        datos = new ImplementacionMysql();
        datos.insertar();
        imprimir(datos);
        datos.listar();

        System.out.println(IAccesoDatos.MAX_REGISTROS);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}