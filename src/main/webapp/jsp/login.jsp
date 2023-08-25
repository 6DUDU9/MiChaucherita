<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>AQUI VA EL JSP DE LOGIN</h1>
	<!-- Login Form -->
			<form action="../DashboardController?ruta=dashboard" method="POST">
				<fieldset>
					<legend>Login</legend>
					<p>Usuario</p>
					<input type="text" name="usuario" />
					
					<br>
					<p>Clave</p>
					<input type="password" name="password" /> 
					
					<br><br><br>
					<input type="submit"
						value="Ingresar" />
					<br><br><br>
				</fieldset>
			</form>
			<a href="listarPersona.html">[DEMO de Ingreso ]</a>
			<a href="error.html">[DEMO de Error ]</a>
</body>
</html>