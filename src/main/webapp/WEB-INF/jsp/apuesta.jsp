<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

<div class="container">
    <form method="post" action="procesar_apuesta.jsp">
        <div class="row">
            <div class="col-md-4">
                <h4>Local</h4>
                <p>${partido.local}</p>
                <input type="text" class="form-control" name="apuestaLocal" placeholder="Apostar">
                <button type="submit" class="btn btn-primary">Apostar</button>
            </div>
            <div class="col-md-4">
                <h4>Visitante</h4>
                <p>${partido.visitante}</p>
                <input type="text" class="form-control" name="apuestaVisitante" placeholder="Apostar">
                <button type="submit" class="btn btn-primary">Apostar</button>
            </div>
            <div class="col-md-4">
                <h4>Fecha</h4>
                <p>${partido.fecha}</p>
            </div>
        </div>
    </form>
</div>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>