<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="card m-5 p-1">
    <form action="/Ayudantia2024-05-31/UsuarioServlet" method="post">

        <div class="form-group" >
				<label for="nombre">Nombre</label> 
				<input type="text" class="form-control" name="nombre">
			</div>
			<div class="form-group">
				<label for="password">Password</label> 
				<input type="text" class="form-control" name="password">
			</div>
			<div class="form-group">
				<label for="rut">Rut</label> 
				<input type="text" class="form-control" name="rut">
			</div>

			<button type="submit" class="btn btn-primary mt-2">Crear</button>
    </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>