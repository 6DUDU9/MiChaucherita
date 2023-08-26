<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="https://kit.fontawesome.com/ae4e5d458c.js" crossorigin="anonymous"></script>
    <title>Movimientos</title>


</head>

<body>
    <header class="bg-yellow d-flex align-items-center flex-wrap justify-content-center p-3">
        <a href="DashboardController"
            class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <img class="" src="${pageContext.request.contextPath}/img/logo.png" alt="Imagen de una billetera">
            <h1 class="font px-3 c-darkgray">Mi Chaucherita Web</h1>
        </a>
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="LoginController" class="nav-link"><i
                        class="c-darkgray fa-solid fa-right-from-bracket fa-2xl i-hover"></i></a>
            </li>
        </ul>
    </header>
    <nav class="bg-darkgray" style="height:46px;">
    </nav>

    <div class="bg-gray row gap-3 m-0 w-auto p-5 ">

        <div class="row d-flex bg-dark-subtle rounded flex-column m-0 py-3">
            <form action="" class="text-center">
                <input type="month" class="text-center mb-3 form-control font-s-30" value="" name="" id="">
                <select class="form-select c-darkgray fs-2 fw-bold mb-3 text-center" id="categoria" name="categoria">
                    <option class="fs-4 text-center" value="cuenta1">Efectivo</option>
                    <option class="fs-4 text-center" value="cuenta2">Banco Pichincha</option>
                </select>
                <button type="submit" class="btn btn-hover bg-yellow fw-bold">Actualizar</button>
            </form>
        </div>

        <div class="row container rounded d-flex flex-column bg-dark-subtle m-0">

            <div class="border border-3 border-dark-subtle rounded my-3 py-3 ">
                <div class="row m-0 rounded pb-3">
                    <h2 class="col-8 text-center fw-bold m-1">Comida</h2>
                    <h2 class="col text-center rounded fw-bold text-danger  m-1">
                        $54<small class="fw-bold text-danger ">.00</small>
                    </h2>
                </div>
                <div class="row m-0 my-2 py-3 rounded bg-white">
                    <h4 class="col fw-bold m-0">
                        $50<small class="fw-bold ">.00</small>
                    </h4>
                    <h7 class="col-6 fw-bold m-1">Descripción</h7>
                    <h6 class="col c-gray fw-bold m-1">dd-mm-aaaa</h6>
                </div>
                <div class="row m-0 my-2 py-3 rounded bg-white">
                    <h4 class="col fw-bold m-0">
                        $4<small class="fw-bold ">.00</small>
                    </h4>
                    <h7 class="col-6 fw-bold m-1">Descripción</h7>
                    <h6 class="col c-gray fw-bold m-1">dd-mm-aaaa</h6>
                </div>

            </div>
            <div class="border border-3 border-dark-subtle rounded my-3 py-3 ">
                <div class="row m-0 my-2 rounded pb-3">
                    <h2 class="col-8 text-center fw-bold m-1">Vestimenta</h2>
                    <h2 class="col text-center rounded fw-bold text-danger  m-1">
                        $85<small class="fw-bold text-danger ">.00</small>
                    </h2>
                </div>
                <div class="row m-0 py-3 rounded bg-white">
                    <h4 class="col fw-bold m-0">
                        $85<small class="fw-bold ">.00</small>
                    </h4>
                    <h7 class="col-6 fw-bold m-1">Descripción</h7>
                    <h6 class="col c-gray fw-bold m-1">dd-mm-aaaa</h6>
                </div>
            </div>

        </div>




    </div>



    <script src=" https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>