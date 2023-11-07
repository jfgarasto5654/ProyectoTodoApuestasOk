<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

<style>
@import url('https://fonts.googleapis.com/css2?family=Nunito&family=Oswald:wght@600&display=swap');
</style>
        
<h1 id="bets">Apuestas</h1>
<div class="row">
    <div class="col-md-12">
        <div class="partidos-container">
            <c:forEach var="apuesta" items="${apuestas}">
                <div class="partido-burbuja">
                    <div class="monto">Monto: $${apuesta.monto}</div>
                    <div class="por_quien">Por Quien: ${apuesta.por_quien}</div>
                    <div class="idUsuario">ID Usuario: ${apuesta.idUsuario}</div>
                    <div class="idPartido">ID Partido: ${apuesta.idPartido}</div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

