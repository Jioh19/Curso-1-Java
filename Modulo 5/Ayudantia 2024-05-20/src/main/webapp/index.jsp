<html>
<body>
<h2 style="border: blue 2px solid">Hello World!</h2>
    <% double edad = 35;
        if(edad >= 18) { %>
            <h4>Eres mayor de edad, adelante!!!</h4>
        <% }%>
        <form method="post" action="/Ayudantia2024-05-20/RecibirInfoServlet">
                <label>Nombre:</label>
                <input type="text" name="nombre">
                <br/>
                <label>Precio:</label>
                <input type="number" name="precio">
                <br/>
                <input type="submit" value="Enviar"/>
        </form>
</body>
</html>
