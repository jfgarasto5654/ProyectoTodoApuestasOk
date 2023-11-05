<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
    <div class="container mt-4">
        <div class="row">
            <div class="col-lg-6">
                <div class="card">
                    
                    <form action="SvBilletera" method="GET"> 
                        <div class="card-body">
                            <h3 class="card-title">Dinero</h3>
                            <p class="card-text">${dinero}</p>
                        </div>                    
                    </form>
                        
                </div>
            </div>
            <div class="col-lg-6">
                <div class="card">
                    <div class="card-body">
                        
                        <form action="SvBilletera" method="POST">
                            <h4 class="card-title">Agregar Dinero</h4>
                            <div class="form-group">
                                <input type="number" class="form-control" name="monto" placeholder="Monto a agregar" id="montoAgregar">
                                <input type="hidden" class="form-control" name="Modificar" value="ingreso" id="montoAgregar">
                            </div>
                            <button class="btn btn-primary" type="submit">Enviar</button>
                        </form>

                        <form action="SvBilletera" method="POST">
                            <h4 class="card-title">Retirar Dinero</h4>
                            <div class="form-group">
                                <input type="number" class="form-control" name="monto" placeholder="Monto a retirar" id="montoRetirar"> 
                                <input type="hidden" class="form-control" name="Modificar" value="retiro" id="montoAgregar">
                            </div>
                            <button class="btn btn-primary" type="submit">Enviar</button> 
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

