package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del formulario html
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        //se imprime en consola del AppServer
        System.out.println("Usuario = "+ usuario);
        System.out.println("Password = " + password);
        
        //se imprime en el navegador
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es : " + usuario);
        out.println("<br/>");
        out.println("El parametro password es: " + password);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
