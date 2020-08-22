
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author juanfelipemurielvalencia
 */

@WebServlet ("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException{
        //simulando los valores de ingreso
        String usuariook = "Felipe";
        String passwordok = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        //hacemos la validacion
        
        if(usuariook.equals(usuario) && password.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED, "El usuario o contraseña no son los correctos");
        }
    }
    
}
