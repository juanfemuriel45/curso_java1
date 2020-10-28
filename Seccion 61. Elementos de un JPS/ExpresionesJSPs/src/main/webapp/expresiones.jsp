<%-- 
    Document   : expresiones
    Created on : Sep 9, 2020, 10:12:09 PM
    Author     : juanfelipemurielvalencia
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JPS con Expresiones</h1>
        Concatenacion: <%= "Saludos" + " " + " JPS" %>
        <br>
        Operacion Matematica <%= 2*3 /2 %>
        <br>
        Session id <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresamos al inicio</a>
    </body>
</html>
