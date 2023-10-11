<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />
        <div id="nav-bar">
            <h1>AP</h1>  
        </div>
        
        <h1>partidos</h1>
        <table border="1" class="tabla-grande">
        <thead>
            <tr>
                <th>Local</th>
                <th>Visitante</th>
                <th>fecha</th>            
                
                <c:forEach items="${listaDePartidos}" var="partido">
                <tr>
                    <td>${partido.local}</td>
                    <td>${partido.visitante}</td>
                    <td>${partido.fecha}</td>
                    <td><a href="/La-pagina-de-apuestas?id=${partido.idParttido}">APOSTAR</a></td>
                </tr>
                </c:forEach>
            </tr>
        </thead>
     
    </table> 
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>

