<%@ page import="java.util.Map" %>
<% Map<String, String> errores = (Map<String, String>)request.getAttribute("errores"); %>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
<body>
<h2>Hello World!</h2>


    <form class="card m-5 p-2" style="width: 40%" action="/Ayudantia2024-05-23/CrearCliente" method="post">
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre">
        <% if(errores != null && errores.containsKey("nombre")) {
            out.println("<div>Error nombre: " + errores.get("nombre") + "</div>");
        }%>
        <label for="apellido">Apellido</label>
        <input type="text" name="apellido">
        <% if(errores != null && errores.containsKey("apellido")) {
            out.println("<div>Error apellido: " + errores.get("apellido") + "</div>");
        }%>
        <label for="rut">Rut</label>
        <input type="text" name="rut">
        <% if(errores != null && errores.containsKey("rut")) {
            out.println("<div>Error rut: " + errores.get("rut") + "</div>");
        }%>
        <input type="submit" class="mt-3" value="enviar">
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"></script>
</body>
</html>
