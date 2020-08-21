/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author juanfelipemurielvalencia
 */
@WebServlet ("/ServletHeaders")
public class ServletHeaders extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("<head>");
        out.print("<body>");
        out.print("<h1>Header HTTP</h1>");
        out.print("Metodo Http: " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.print("</br>");
        out.print("Uri solicitada: " + uri);
        
        
        out.print("<br>");
        out.print("<br>");
        
        //imprimir todos los cabeceros
        Enumeration cabeceros = request.getHeaderNames();
        
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "<b>" );
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }

        
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
