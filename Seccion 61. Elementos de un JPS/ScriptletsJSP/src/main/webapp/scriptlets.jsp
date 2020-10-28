<%-- 
    Document   : scriplets
    Created on : Sep 9, 2020, 10:37:11 PM
    Author     : juanfelipemurielvalencia
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scriptlets para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un scriptlet");
        %>
        
        <%-- Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreApliacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreApliacion);
        %>
        <br>
        <%-- Scritlet con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){            
        %>
        
        la sesion SI es nueva
        
        <%
            }else if(session != null){
        %>
        
        la sesion NO es nueva
        
        <% } %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
