package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;

/**
 *
 * @author siscjfmuriel
 */
public class AccesoDatos {
  public boolean existe(String nombreArchivo){
      return false;
  }
  
  public List<Pelicula> listar(String nombre){
      return null;
  }
  
  public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar){
      
  }
  
  public String buscar(String nombreArchivo ,String buscar){
      return null;
  }
  
  public void crear(String nombre){
      
  }
  
  public void borrar(String nombreArchivo){
      
  }
}