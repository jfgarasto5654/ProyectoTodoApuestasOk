<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
        <body>
    <div class="container mt-4">
        <div class="row">
            <div class="col-lg-6">
                <div class="card">
                    <div class="card-body">
                        <h3 class="card-title">Dinero</h3>
                        <p class="card-text">9999999</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">Agregar Dinero</h4>
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="Monto a agregar">
                        </div>
                        <h4 class="card-title">Retirar Dinero</h4>
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="Monto a retirar">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

