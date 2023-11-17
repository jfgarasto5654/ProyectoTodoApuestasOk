<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

<style>
@import url('https://fonts.googleapis.com/css2?family=Nunito&family=Oswald:wght@600&display=swap');
</style>
        
<h1 id = "bets">BALANCE</h1>
<h1 id = "bets">Partidos con mayores perdidas ordenados de mayor a menor</h1>

<div style="display: flex; justify-content: center;">
    <table border="1" style="color: aliceblue; width: 600px; height: 600px; background: #000000;">
        <thead>
            <tr>
                <th>Equipo Local</th>
                <th>Equipo Visitante</th>
                <th>Monto</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${apuestasPerdidas}" var="apuesta">
                <tr>
                    <td>${apuesta.local}</td>
                    <td>${apuesta.visitante}</td>
                    <td>${apuesta.monto}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
 
        <c:import url="componentesHTML/footer.jsp" /> 

