<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>Entre bien al servlet y me redirigio a esta pagina!!!!</h1>
  <% String nombre = (String) request.getAttribute("nombre");
    String password = (String) request.getAttribute("password");
    String rut = (String) request.getAttribute("rut"); %>

    <% for(int i = 0; i < 10; i++) {  %>
      <div>Codigo del for repetido x10</div>

    <%} %>
  <div>Mi nombre es <%=nombre%></div>
  <div>Mi password es <%=password %></div>
  <div>Mi rut es <%=rut %></div>
</body>
</html>