<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL CORE</title>
    </head>
    <body>
        <h1>JSTL CORE</h1>
        <!-- Manipulación de variables -->
        <!-- Definicio de variables -->
        <c:set var="nombre" value="Ernesto" />
        <!-- Impresion de variables -->
        Variable Implicita: <c:out value="${nombre}" />
        <br><!-- comment -->
        Variable con codigo html
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br>
        <!-- Uso if -->
        <c:set var="bandera" value="true" />
        <c:if test="${!bandera}">
            La bandera es verdadera
        </c:if>
            <br>
        <!-- Uso switch --> 
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion==1}">
                    <br>
                    Opcion 1 seleccionada
                </c:when >   
                <c:when test="${param.opcion==2}">
                    <br>
                    Opcion 2 seleccionada
                </c:when > 
                <c:otherwise>
                    </br>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose> 
        </c:if>
                    
        <!-- Iteracion de un arreglo-->
        <%
        String nombres[]={"Juan", "Felipe", "Muriel"};
        request.setAttribute("nombres", nombres);
        %>
        </br><!-- comment -->
        Lista de nombres
        </br>
        
        <ul>
            <c:forEach var="persona" items="${nombres}" >
                <li>${persona}</li>
            </c:forEach>
        </ul>
        </br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>