<%@page import="com.alke.model.*, java.util.*"%>
<%
Usuario usuario = (Usuario) request.getAttribute("usuario");
List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Usuarios</title>
</head>
<body>
    <h1>Bienvenido</h1>

    <% for(Usuario user: usuarios) { %>
    <div><%=user.getNombre()%>:   <%=user.getPassword()%></div>
    <%}%>
</body>
</html>