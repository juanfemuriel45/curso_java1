<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel-" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <th>1. Fundamentos de java</th>
                <th>Aprenderemos la sintaxis basica de Java</th>
                <th><%=Conversiones.format(new Date()) %></th>
            </tr>
            <tr>
                <th>2. Programacion con java</th>
                <th>Apondremos en practica conceptos de la programacion orientada a objetos</th>
                <th><%=Conversiones.format(new Date()) %></th>
            </tr>
            
        </table>
    </body>
</html>
