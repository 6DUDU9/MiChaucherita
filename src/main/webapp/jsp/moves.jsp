<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<script src="https://kit.fontawesome.com/ae4e5d458c.js"
	crossorigin="anonymous"></script>
<title>Movimientos</title>
</head>

<body class="bg-gray">
	<header
		class="bg-yellow d-flex align-items-center flex-wrap justify-content-center p-3">
		<a href="DashboardController?ruta=dashboard"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
			<img class="" src="${pageContext.request.contextPath}/img/logo.png"
			alt="Imagen de una billetera">
			<h1 class="font px-3 c-darkgray">Mi Chaucherita Web</h1>
		</a>
		<ul class="nav nav-pills">
			<i class="mt-1"><a href="" class="nav-link c-darkgray">Bienvenido:
			</a></i>
			<i class="mt-1"><a href="" class="nav-link c-darkgray">${sessionScope.nameUser}</a></i>
			<li class="nav-item"><a href="./DashboardController?ruta=salir"
				class="nav-link"><i
					class="c-darkgray fa-solid fa-right-from-bracket fa-2xl i-hover"></i></a>
			</li>
		</ul>
	</header>
	<nav class="bg-darkgray" style="height: 46px;"></nav>



	<div class="container py-5">
		<div class="card mb-4 rounded-3 shadow-sm">
			<div
				class="card-header bg-dark-subtle d-flex justify-content-center py-3">

				<c:choose>
					<c:when test="${verTipo eq 'Todas'}">
						<form action="DashboardController?ruta=verPorTodosMovimientos"
							method="POST" class="text-center">
							<input type="date"
								class="text-center bg-dark-subtle border-0 form-control font-s-30"
								value="${date}" name="fecha" id="fecha">
							<h1 class=" my-3">${accountName}</h1>


							<button type="submit" class="btn btn-hover bg-yellow fw-bold">Actualizar</button>
						</form>
					</c:when>
					<c:when test="${verTipo eq 'Cuenta'}">
						<form
							action="DashboardController?ruta=verPorCuenta&cuentaID=${cuentaID}"
							method="POST" class="text-center">
							<input type="date"
								class="text-center bg-dark-subtle border-0 form-control font-s-30"
								value="${date}" name="fecha" id="fecha">
							<h1 class=" my-3">${accountName}</h1>


							<button type="submit" class="btn btn-hover bg-yellow fw-bold">Actualizar</button>
						</form>
					</c:when>
					<c:when test="${verTipo eq 'Cat'}">
						<form
							action="DashboardController?ruta=verPorCategoria&catID=${catID}"
							method="POST" class="text-center">
							<input type="date"
								class="text-center bg-dark-subtle border-0 form-control font-s-30"
								value="${date}" name="fecha" id="fecha">
							<h1 class=" my-3">${accountName}</h1>


							<button type="submit" class="btn btn-hover bg-yellow fw-bold">Actualizar</button>
						</form>
					</c:when>
				</c:choose>


			</div>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Fecha</th>
						<th scope="col">Cuenta</th>
						<th scope="col">Monto</th>
						<th scope="col">Categoría</th>
						<th scope="col">Descripción</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${movimientos}" var="movimiento">
						<tr>
							<th scope="row">${movimiento.date}</th>
							<td>${movimiento.account.accountName}</td>


							<td style="color: ${movimiento.category.type == 'INCOME' ? 'green' : movimiento.category.type == 'SPENT' ? 'red' : 'black'}">${movimiento.balance}</td>


							<td>${movimiento.category.categoryName}</td>
							<td>${movimiento.description}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<script
		src=" https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>

</html>