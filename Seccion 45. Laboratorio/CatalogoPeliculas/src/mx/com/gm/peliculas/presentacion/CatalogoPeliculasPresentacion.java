package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

/**
 *
 * @author juanfelipemurielvalencia
 */
public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {

        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo de peliculas\n"
                    + "2. Agregar pelicula\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Peliculas\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Agregar nombre de la pelicula: ");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("introduce una pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;   
            }
        }
    }
}
