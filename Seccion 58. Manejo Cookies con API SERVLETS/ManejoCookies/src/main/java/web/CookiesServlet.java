
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
@WebServlet ("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //suponemos que el usuario visita por primera vez
        boolean nuevoUsuario = true;
        
        //obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //buscar si ya existe una cookie creada con anterioridad
        //visitante recurrente
        
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                   nuevoUsuario = false; 
                   break;
                }
            }
        }
        
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestra pagina web por primera vez";
        }else{
            mensaje = "Gracias por visitar nuestra pagina web NUEVAMENTE";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
        
    }
}
