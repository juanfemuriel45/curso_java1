package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author juanfelipemurielvalencia
 */

@WebServlet("/ContadorVisitasServlet")

public class ContadorVisitasServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declarar variable contador
        int contador = 0;
        
        //Revisar si existe la cookie contadorVisitas
        Cookie[] cokies = request.getCookies();
        
        if(cokies != null){
            for(Cookie c: cokies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        //incrementar el contador
        contador++;
        //Agregamos la respuesta al navegador
        Cookie c = new Cookie ("contadorVisitas", Integer.toString(contador));
        //La cokie se almacenara en el cliente por una hora (3600 s)
        c.setMaxAge(3600);
        
        response.addCookie(c);
        
        //mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
        
    }
}
