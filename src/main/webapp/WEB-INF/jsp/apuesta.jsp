<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

    <h1>Detalles del Partido</h1>
    <p>Local: ${partido.local}</p>
    <p>Visitante: ${partido.visitante}</p>
    <p>Fecha: ${partido.fecha}</p>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>