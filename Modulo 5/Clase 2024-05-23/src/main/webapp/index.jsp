<%@ page contentType="text/html; charset=UTF-8" %> <%@ page
import="java.util.Map" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<title>Formulario</title>
	</head>

	<body>
		<form action="/post/" method="post">
			<label for="username">Usuario</label>
			<input
				type="text"
				name="username"
				id="username"
				value="Ingrese usuario" />
			<label for="password">Password</label>
			<input type="password" name="password" id="password" />
			<label for="email">Email</label>
			<input type="text" name="email" id="email" />
			<label for="pais">Pais</label>
			<select name="pais" id="pais">
				<option value="">Seleccionar</option>
				<option value="ES">España</option>
				<option value="MX">México</option>
				<option value="CL">Chile</option>
				<option value="PE">Perú</option>
				<option value="CO">Colombia</option>
				<option value="CR">Corea del Sur</option>
				<option value="VE">Venezuela</option>
			</select>

			<input type="submit" value="Enviar" />
		</form>
	</body>
</html>
