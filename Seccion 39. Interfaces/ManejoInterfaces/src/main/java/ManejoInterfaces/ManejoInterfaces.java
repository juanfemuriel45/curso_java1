package ManejoInterfaces;

import datos.*;

public class ManejoInterfaces {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        
        datos = new ImplementacionMysql();
        datos.insertar();
        datos.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
}
