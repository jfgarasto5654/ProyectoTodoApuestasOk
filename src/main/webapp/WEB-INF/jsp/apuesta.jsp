<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

    <div class="equipo-local">${partido.local}</div>
    <div class="equipo-visitante">${partido.visitante}</div>
    <div class="fecha">${partido.fecha}</div>
    
    <form action="procesarApuesta" method="post">
        <input type="hidden" name="partidoId" value="${partido.id}">
        <input type="text" name="apuestaLocal" placeholder="Apuesta para el equipo local">
        <input type="text" name="apuestaVisitante" placeholder="Apuesta para el equipo visitante">
        <button type="submit" name="apostarLocal">Apostar al local</button>
        <button type="submit" name="apostarVisitante">Apostar al visitante</button>
    </form>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>