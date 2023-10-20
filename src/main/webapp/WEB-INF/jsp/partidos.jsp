<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
        
<h1 style="margin-top: 30px; color: aliceblue">Partidos Disponibles</h1>
<div class="row">
    <div class="col-md-12">
        <div class="partidos-container">
            <c:forEach items="${listaDePartidos}" var="partido" varStatus="loop">
                <div class="partido-burbuja">
                    <div class="equipo-local">${partido.local}</div>
                    <div class="equipo-visitante">${partido.visitante}</div>
                    <div class="fecha">${partido.fecha}</div>
                    <a class="btn btn-primary" href="/ApuestaTodook/Apuesta?id=${partido.idParttido}">APOSTAR</a>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</html>

