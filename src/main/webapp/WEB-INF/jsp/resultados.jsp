<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
 <h1 id="bets">Resultados</h1>
    <div class="row">
    <div class="col-md-12">
        <div class="partidos-container">
                    <c:forEach var="r" items="${resultados}">
            <div class="partido-burbuja">
                <div class="idResultado">ID Resultado: ${r.idResultado}</div>
                <div class="ganador">Ganador: ${r.ganador}</div>
            </div>
        </c:forEach>
        </div>
    </div>
    </div>
                        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

