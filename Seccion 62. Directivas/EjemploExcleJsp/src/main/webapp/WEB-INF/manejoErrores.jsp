<%@page isErrorPage="true" %>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de errores</title>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <br/>
        Ocurrio una excepcion: <%= exception.getMessage() %>
        <br/>
        <textarea cols="6">
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </textarea>
            
        
    </body>
</html>
