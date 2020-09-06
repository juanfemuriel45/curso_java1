package web;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author juanfelipemurielvalencia
 */

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    
    
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        
        String titulo = null;
        
        //pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //si es la primera vez
        if(contadorVisitas == null){
            contadorVisitas=1;
            titulo = "Bienvenido por primera vez";
        } 
        else{
            contadorVisitas++;
            titulo = "Bienvenido Nuevamente";
        }
        
        //agregamos el nuevo valor de la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //mandamos la respuesta al cliente
        
        PrintWriter out = response.getWriter();
        out.print("Titulo : " + titulo);
        out.print("<br>");
        out.print("No. Accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: " + sesion.getId());
        
        
    }
}
