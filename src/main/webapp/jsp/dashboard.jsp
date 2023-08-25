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


</head>

<body>
    <header class="bg-yellow d-flex align-items-center flex-wrap justify-content-center p-3">
        <a href="DashboardController"
            class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <img class="" src="img/logo.png" alt="Imagen de una billetera">
            <h1 class="font px-3 c-darkgray">Mi Chaucherita Web</h1>
        </a>
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="LoginController" class="nav-link"><i
                        class="c-darkgray fa-solid fa-right-from-bracket fa-2xl i-hover"></i></a>
            </li>
        </ul>
    </header>
    <nav class="d-flex bg-darkgray justify-content-center">
        <ul class="nav nav-pills">
            <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#ingresoModal"
                    class="nav-link c-yellow a-hover fs-5">Ingreso</a></li>
            <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#gastoModal"
                    class="nav-link c-yellow a-hover fs-5">Gasto</a></li>
            <li class="nav-item"><a data-bs-toggle="modal" data-bs-target="#transferModal"
                    class="nav-link c-yellow a-hover fs-5">Transferencia</a></li>
            <li class="nav-item"><a href="MovesController" class="nav-link c-yellow a-hover fs-5">Ver movimientos</a>
            </li>
        </ul>
    </nav>
    <div class="bg-gray">
        <div class="m-0 w-auto p-5 ">
            <div class="row gap-4 m-0">
                <div class="col-5 card-header bg-dark-subtle rounded py-3 h-25">
                    <h1 class="text-center card-title c-darkgray fs-3 fw-bold">Saldo:</h1>
                    <h1 class="text-center card-title">
                        $865<small class="fw-light">.00</small>
                    </h1>
                </div>
                <div class="col p-0 card-header bg-dark-subtle rounded py-3 ">
                    <h1 class="text-center card-title c-darkgray fs-3 fw-bold ">Ingresos
                        totales:</h1>
                    <h1 class="text-center text-success card-title">
                        $15<small class="fw-light">.00</small>
                    </h1>
                </div>
                <div class="col card-header bg-dark-subtle rounded py-3">
                    <h1 class="text-center card-title c-darkgray fs-3 fw-bold">Gastos
                        totales:</h1>
                    <h1 class="text-center text-danger card-title">
                        $15<small class="fw-light">.00</small>
                    </h1>
                </div>
            </div>
            <div class="row gap-4 m-0 h-auto py-4">
                <div class="col-5 card-header bg-dark-subtle rounded text-center py-3">
                    <h1 class="c-darkgray card-title fs-3 mb-3 fw-bold">Detalle de cuentas:</h1>
                    <div class="card-body mb-4">
                        <h5 class="c-gray fw-bold m-1">Efectivo</h5>
                        <h4 class="fw-bold m-0">
                            $120<small class="fw-bold ">.00</small>
                        </h4>
                        <a
                            class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                            movimientos</a> <a
                            class=" d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ajustar</a>
                    </div>
                    <div class="card-body mb-4">
                        <h5 class="c-gray fw-bold m-1">Banco Pinchincha</h5>
                        <h4 class="fw-bold m-0">
                            $465<small class="fw-bold ">.00</small>
                        </h4>
                        <a
                            class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                            movimientos</a> <a
                            class=" d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ajustar</a>
                    </div>
                    <div class="card-body mb-4">
                        <h5 class="c-gray fw-bold m-1">Banco Bolivariano</h5>
                        <h4 class="fw-bold m-0">
                            $300<small class="fw-bold ">.00</small>
                        </h4>
                        <a
                            class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                            movimientos</a> <a
                            class=" d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ajustar</a>
                    </div>


                </div>
                <div class="col m-0 p-0 d-flex flex-column ">
                    <div class="m-0 flex-fill card-header bg-dark-subtle rounded text-center py-3">
                        <h1 class="text-center card-title c-darkgray fs-3 mb-3 fw-bold">Cuenta
                            Egresos:</h1>

                        <div class="card-body mb-4">
                            <h5 class="c-gray fw-bold m-1">Comida</h5>
                            <h4 class="fw-bold text-danger  m-0">
                                $54<small class="fw-bold text-danger ">.00</small>
                            </h4>
                            <a
                                class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                                movimientos</a>
                        </div>
                        <div class="card-body mb-4">
                            <h5 class="c-gray fw-bold m-1">Vestimenta</h5>
                            <h4 class="fw-bold text-danger  m-0">
                                $85<small class="fw-bold text-danger ">.00</small>
                            </h4>
                            <a
                                class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                                movimientos</a>
                        </div>
                        <div class="card-body mb-4">
                            <h5 class="c-gray fw-bold m-1">Renta</h5>
                            <h4 class="fw-bold text-danger  m-0">
                                $130<small class="fw-bold text-danger ">.00</small>
                            </h4>
                            <a
                                class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                                movimientos</a>
                        </div>
                    </div>
                    <div class="m-0 flex-fill card-header bg-dark-subtle rounded text-center py-3 mt-4">
                        <h1 class=" card-title c-darkgray fs-3 mb-3 fw-bold">Cuenta
                            Ingresos:</h1>
                        <div class="card-body mb-4">
                            <h5 class="c-gray fw-bold m-1">Nomina</h5>
                            <h4 class="fw-bold text-success  m-0">
                                $3000<small class="fw-bold text-success ">.00</small>
                            </h4>
                            <a
                                class="d-inline-block link-offset-2 link-underline link-underline-opacity-0 link-underline-opacity-100-hover">Ver
                                movimientos</a>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class=" modal fade" id="gastoModal" tabindex="-1" aria-labelledby="gastoModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header bg-yellow font-w-bold">
                    <h1 class="modal-title fs-5 fw-bold" id="gastoModalLabel">Gasto</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="SpentController" method="">
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
                        <input type="text" name="pago" id="pago" oninput="formatMoney(this)" class="form-control"
                            required>
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
    <div class="modal fade" id="transferModal" tabindex="-1" aria-labelledby="transferModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header bg-yellow font-w-bold">
                    <h1 class="modal-title fs-5 fw-bold" id="transfereModalLabel">
                        Transferencia</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="TransferController" method="">
                        <label for="descripcion" class="form-label">Descripción:</label>
                        <textarea class="form-control" id="descripcion" name="descripcion" rows="1"></textarea>
                        <label for="fecha" class="form-label">Fecha:</label> <input type="date" class="form-control"
                            value="" name="fecha" id="fecha"> <label for="monto" class="form-label">Monto:</label>
                        <input type="text" name="pago" id="pago" oninput="formatMoney(this)" class="form-control"
                            required>
                        <label for="origen" class="form-label">Origen:</label>
                        <select class="form-select" id="origen" name="origen">
                            <option selected hidden></option>
                            <option value="cuenta1">Cuenta 1</option>
                            <option value="cuenta2">Cuenta 2</option>
                        </select> <label for="destino" class="form-label">Destino:</label>
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
    <div class="modal fade" id="ingresoModal" tabindex="-1" aria-labelledby="ingresoModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header bg-yellow font-w-bold">
                    <h1 class="modal-title fs-5 fw-bold" id="ingresoModalLabel">Ingreso</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="IncomeController" method="">
                        <label for="categoria" class="form-label">Categoría:</label>
                        <select class="form-select" id="categoria" name="categoria">
                            <option selected hidden></option>
                            <option value="cat1">Categoria1</option>
                        </select> <label for="descripcion" class="form-label">Descripción:</label>
                        <textarea class="form-control" id="descripcion" name="descripcion" rows="1"></textarea>
                        <label for="fecha" class="form-label">Fecha:</label> <input type="date" class="form-control"
                            value="" name="fecha" id="fecha"> <label for="monto" class="form-label">Monto:</label>
                        <input type="text" name="pago" id="pago" oninput="formatMoney(this)" class="form-control"
                            required>
                        <label for="pago" class="form-label">Pago:</label> <select class="form-select" id="pago"
                            name="pago">
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

    <script src=" https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>