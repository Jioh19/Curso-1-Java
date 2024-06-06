<%@page import="com.alke.model.*"%>
<% Usuario usuario = (Usuario) request.getAttribute("usuario"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bienvenido</title>
</head>
<body>
    <h1>Bienvenido <%=usuario.getNombre() %></h1>
    <h3>Tu balance es de $<%=usuario.getBalance() %></h3>
</body>
</html>