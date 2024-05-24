<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Map" %>
<% Map<String, String> errores = (Map<String, String>)request.getAttribute("errores"); %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<title>Formulario</title>
	</head>

	<body>
		<form action="/Clase2024-05-23/registro" method="post">
			<label for="username">Usuario</label>
			<input
				type="text"
				name="username"
				id="username"
		/>
			<% if(errores != null && errores.containsKey("username")) {
			out.println( "<div>Error usuario: " + errores.get("username")+ "</div>");
			}%>
			<label for="password">Password</label>
			<input type="password" name="password" id="password" />
			<% if(errores!= null && errores.containsKey("password")) {
				out.println( "<div>Error password: " + errores.get("password")+ "</div>");
				}%>
			<label for="email">Email</label>
			<input type="text" name="email" id="email" />
			<% if(errores!= null && errores.containsKey("email")) {
				out.println( "<div>Error email: " + errores.get("mail")+ "</div>");
				}%>
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
			<% if(errores!= null && errores.containsKey("pais")) {
				out.println( "<div>Error pais: " + errores.get("pais")+ "</div>");
				}%>

			<input type="submit" value="Enviar" />
		</form>
	</body>
</html>
