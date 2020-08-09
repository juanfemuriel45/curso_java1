package mx.com.gm.peliculas.servicio;

/**
 *
 * @author juanfelipemurielvalencia
 */
public interface ICatalogoPeliculas {
    public static final String NOMBRE_RECURSO = "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void iniciarCatalogoPeliculas();
    public void buscarPeliculas(String buscar);
}