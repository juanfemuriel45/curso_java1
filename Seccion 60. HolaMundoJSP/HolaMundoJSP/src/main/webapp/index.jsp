<%-- 
    Document   : index
    Created on : Sep 6, 2020, 9:06:56 PM
    Author     : juanfelipemurielvalencia
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con Scriplets"); %> </li>
            <li>${"HolaMundo con Explression Languege (EL)"}</li>
            <li> <%= "HolaMundo con expresiones"%> </li>
            <li> <c:out value="HolaMundo con JSTL" /> </li>
        </ul>
    </body>
</html>
