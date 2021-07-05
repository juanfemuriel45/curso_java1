
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")

public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos los parametros
        //2. Crear los javaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3. Agregamos el javabeans a algun alcance
        request.setAttribute("mensaje", "saludos desde el servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        //4.Redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
}
