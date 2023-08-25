<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://kit.fontawesome.com/ae4e5d458c.js" crossorigin="anonymous"></script>
    <title>Dashboard</title>
    <style>
        
    </style>
</head>
<body>
    <header class="bg-yellow d-flex align-items-center flex-wrap justify-content-center p-3">
        <a href="borrador.html"
            class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <img class="" src="img/logo.png" alt="Imagen de una billetera">
            <h1 class="font px-3 c-darkgray">Mi Chaucherita Web</h1>
        </a>
        <ul class="nav nav-pills">
            <div class="circle-container">
                <i class="fa-regular fa-user fa-2xl icon c-yellow"></i>
            </div>
            <i class="mt-1"><a href="configuracion.html" class="nav-link c-darkgray">Usuario</a></i>
            <li class="nav-item">
                <a href="login.html" class="nav-link"><i class="c-darkgray fa-solid fa-right-from-bracket fa-2xl i-hover"></i></a>
            </li>
        </ul>
    </header> 
    <div class="bg-gray">
        <div class="d-flex justify-content-center">
            <ul class="nav nav-pills">
                <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#ingresoModal" class="nav-link c-yellow"><i>Ingresos</i></a></li>
                <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#gastoModal"  class="nav-link c-yellow"><i>Gastos</i></a></li>
                <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#transferModal"  class="nav-link c-yellow"><i>Transferencia</i></a></li>
                <li class="nav-item"><a href="../DashboardController?ruta=verMovimiento1" class="nav-link c-yellow"><i>Ver movimientos</i></a></li>
            </ul>
        </div>
        
        <div class="">
            <div class="row">
                <div class="col-1"></div>
                <div class="col-4">
                        <div class="row">
                            <div class="card-header bg-dark-subtle mt-3 mb-3 rounded">
                                <h1 class="text-center c-darkgray fs-3">Saldo:</h1>
                                <h1 class="text-center">$865<small class="fw-light">.00</small></h1>
                            </div>
                            <div class="card-header bg-dark-subtle mt-3 mb-3 rounded text-center">
                                <h1 class="c-darkgray fs-3 mt-4">Detalle de cuentas:</h1>
                                <h4 >Fisico</h4>
                                <a class="d-inline-block"">Ver movimientos</a>
                                <a class="d-inline-block"">Ajustar</a>
                                <h4>$120<small class="fw-light">.00</small></h4>
                                <h4>Banco Pichincha</h4>
                                <a class="d-inline-block"">Ver movimientos</a>
                                <a class="d-inline-block"">Ajustar</a>
                                <h4>$465<small class="fw-light">.00</small></h4>
                                <h4>Banco Bolivariano</h4>
                                <a class="d-inline-block"">Ver movimientos</a>
                                <a class="d-inline-block"">Ajustar</a>
                                <h4>$300<small class="fw-light">.00</small></h4>
                            </div>
                        </div>
                </div>
                <div class="col-1"></div>
                <div class="col-6">
                        <div class="row">
                            <div class="col-5 card-header bg-dark-subtle mt-3 mb-3 rounded">
                                <h1 class="text-center card-title c-darkgray fs-3">Ingresos totales:</h1>
                                <h1 class="text-center text-success card-title">$15<small class="fw-light">.00</small>
                                </h1>
                            </div>
                            <div class="col-1"></div>
                            <div class="col-5 card-header bg-dark-subtle mt-3 mb-3 rounded">
                                <h1 class="text-center card-title c-darkgray fs-3">Gastos totales:</h1>
                                <h1 class="text-center text-danger card-title">$15<small class="fw-light">.00</small>
                                </h1>
                            </div>
                        <div class="row">
                            <div class="col-11 card-header bg-dark-subtle mt-3 mb-3 rounded text-center">
                                <h1 class="text-center card-title c-darkgray fs-3 mb-3">Cuenta Egresos:</h1>
                                <h6>Comida</h6>
                                <a class="d-inline-block"">Ver movimientos</a>
                                <h5 class="text-danger">$54<small class="fw-light">.00</small></h5>
                                <h6>Vestimenta</h6>
                                <h5 class="text-danger">$85<small class="fw-light">.00</small></h5>
                                <a class="d-inline-block"">Ver movimientos</a>
                                <h6>Renta</h6>
                                <h5 class="text-danger">$120<small class="fw-light">.00</small></h5>
                                <a class="d-inline-block"">Ver movimientos</a>
                                </h1>
                            </div>
                            <div class="col-11 card-header bg-dark-subtle mt-3 mb-3 rounded text-center ">
                                <h1 class="card-title c-darkgray fs-3 mb-3">Cuenta Ingresos:</h1>
                                <h6>Nomina</h6>
                                <h5 class="text-success">$120<small class="fw-light">.00</small></h5>
                                <a class="d-inline-block"">Ver movimientos</a>
                                </h1>
                            </div>
                        </div>
                </div>   
            </div>
        </div>
        
        <div class="modal fade" id="gastoModal" tabindex="-1" aria-labelledby="gastoModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-yellow font-w-bold">
                        <h1 class="modal-title fs-5" id="gastoModalLabel">Gasto</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="">
                            <label for="categoria" class="form-label">Categoría:</label>
                            <select class="form-select" id="categoria" name="categoria">
                                <option selected hidden></option>
                                <option value="cat1">Categoría 1</option>
                                <option value="cat2">Categoría 2</option>
                            </select>
                            <label for="descripcion" class="form-label">Descripción:</label>
                            <textarea class="form-control" id="descripcion" name="descripcion" rows="1"></textarea>
                            <label for="fecha" class="form-label">Fecha:</label>
                            <input type="date" class="form-control" value="" name="fecha" id="fecha">
                            <label for="monto" class="form-label">Monto:</label>
                            <input type="text" name="pago" id="pago" oninput="formatMoney(this)"
                                class="form-control" required>
                            <label for="pago" class="form-label">Pago:</label>
                            <select class="form-select" id="pago" name="pago">
                                <option selected hidden></option>
                                <option value="cuenta1">Cuenta 1</option>
                                <option value="cuenta2">Cuenta 2</option>
                            </select>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-hover bg-gray c-white"
                                    data-bs-dismiss="modal">Cerrar</button>
                                <button type="submit" class="btn btn-hover bg-yellow">Guardar</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <div class="modal fade" id="transferModal" tabindex="-1" aria-labelledby="transferModalLabel"
            aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-yellow font-w-bold">
                        <h1 class="modal-title fs-5" id="transfereModalLabel">Transferencia</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="">
                            <label for="descripcion" class="form-label">Descripción:</label>
                            <textarea class="form-control" id="descripcion" name="descripcion" rows="1"></textarea>
                            <label for="fecha" class="form-label">Fecha:</label>
                            <input type="date" class="form-control" value="" name="fecha" id="fecha">
                            <label for="monto" class="form-label">Monto:</label>
                            <input type="text" name="pago" id="pago" oninput="formatMoney(this)"
                                class="form-control" required>
                            <label for="origen" class="form-label">Origen:</label>
                            <select class="form-select" id="origen" name="origen">
                                <option selected hidden></option>
                                <option value="cuenta1">Cuenta 1</option>
                                <option value="cuenta2">Cuenta 2</option>
                            </select>
                            <label for="destino" class="form-label">Destino:</label>
                            <select class="form-select" id="destino" name="destino">
                                <option selected hidden></option>
                                <option value="cuenta1">Cuenta 1</option>
                                <option value="cuenta2">Cuenta 2</option>
                            </select>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-hover bg-gray c-white"
                                    data-bs-dismiss="modal">Cerrar</button>
                                <button type="submit" class="btn btn-hover bg-yellow">Guardar</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <div class="modal fade" id="ingresoModal" tabindex="-1" aria-labelledby="ingresoModalLabel"
            aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-yellow font-w-bold">
                        <h1 class="modal-title fs-5" id="ingresoModalLabel">Ingreso</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="">
                            <label for="categoria" class="form-label">Categoría:</label>
                            <select class="form-select" id="categoria" name="categoria">
                                <option selected hidden></option>
                                <option value="cat1">Categoría 1</option>
                                <option value="cat2">Categoría 2</option>
                            </select>
                            <label for="descripcion" class="form-label">Descripción:</label>
                            <textarea class="form-control" id="descripcion" name="descripcion" rows="1"></textarea>
                            <label for="fecha" class="form-label">Fecha:</label>
                            <input type="date" class="form-control" value="" name="fecha" id="fecha">
                            <label for="monto" class="form-label">Monto:</label>
                            <input type="text" name="pago" id="pago" oninput="formatMoney(this)"
                                class="form-control" required>
                            <label for="pago" class="form-label">Pago:</label>
                            <select class="form-select" id="pago" name="pago">
                                <option selected hidden></option>
                                <option value="cuenta1">Cuenta 1</option>
                                <option value="cuenta2">Cuenta 2</option>
                            </select>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-hover bg-gray c-white"
                                    data-bs-dismiss="modal">Cerrar</button>
                                <button type="submit" class="btn btn-hover bg-yellow">Guardar</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <div class="modal fade" id="crearCuentaModal" tabindex="-1" aria-labelledby="crearCuentaModalLabel"
            aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-yellow font-w-bold">
                        <h1 class="modal-title fs-5" id="crearCuentaModalLabel">Crear Cuenta</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="">
                            <label for="nombre" class="form-label">Nombre:</label>
                            <input class="form-control" id="nombre" name="nombre"></input>
                            <label for="tipo" class="form-label">Tipo:</label>
                            <select class="form-select" id="tipo" name="tipo">
                                <option selected hidden></option>
                                <option value="i">Ingresos</option>
                                <option value="g">Gastos</option>
                                <option value="ig">Ingresos y Gastos</option>
                            </select>


                            <div class="modal-footer">
                                <button type="button" class="btn btn-hover bg-gray c-white"
                                    data-bs-dismiss="modal">Cerrar</button>
                                <button type="submit" class="btn btn-hover bg-yellow">Guardar</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        
    </div> 
    <script>
        function formatMoney(input) {
            let value = input.value.replace(/[^\d.]/g, ''); // Remover caracteres no numéricos excepto punto
            value = value.replace(/(\..*?)\..*/g, '$1'); // Permitir solo un punto decimal

            // Si hay un punto decimal, asegurarse de que no se ingrese otro punto a la derecha
            if (value.indexOf('.') !== -1) {
                const parts = value.split('.');
                value = parts[0] + '.' + parts[1].substr(0, 2);
            }

            input.value = '$' + value; // Agregar símbolo de moneda
        }



    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
    
</body>
</html>