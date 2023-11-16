<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
    <div class="container-agregarPartidos">
        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-body">
                        <form action="AdminPartidos" method="POST">
                            <h4 class="card-title">Agregar Partido</h4>
                            <div class="form-group">
                                <input type="text" class="form-control" name="Local" placeholder="Local" id="montoAgregar" style="padding: 20px">
                                <input type="text" class="form-control" name="Visitante" placeholder="Visitante" id="montoAgregar">
                                <input type="text" class="form-control" name="Fecha" placeholder="Fecha" id="montoAgregar">
                                <input type="hidden" class="form-control" name="Modificar" value="ingreso" id="montoAgregar">
                            </div>
                            <button class="btn btn-success" type="submit">Agregar</button>
                        </form>
                    </div>
                </div>
        </div>
    </div>
   </div>

        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

