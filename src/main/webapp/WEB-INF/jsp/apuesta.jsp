<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-Iniciado.jsp" />
<c:import url="componentesHTML/ul-BarraDeportes.jsp" />

<div class="container">
    
    <div class="row" style="background-color: #ccc414; margin-top: 50px">
            <div class="col-md-4" style="color: #000000; padding: 30px">
                <h4>Local</h4>
                <p>${partido.local}</p>
                
                <form action="SvprocesarApuesta" method="POST">
                             
                      <div class="form-outline mb-4">
                             <input type="text" id="form2Example11" class="form-control"
                             placeholder="Monto" name="monto"/>
                             <input type="hidden" name="por" value="local">
                             <input type="hidden" name="idPartido" value= "${idpartido}">
                      </div>
                            <input class="btn btn-primary" type="submit" name="Enviar datos" value="Apostar">                           
                  </form>
            </div>
                      
                      <div class="col-md-4" style="color: #000000; padding: 30px">
                <h4>Visitante</h4>
                <p>${partido.visitante}</p>
                
                <form action="SvprocesarApuesta" method="POST">
                             
                      <div class="form-outline mb-4">
                             <input type="text" id="form2Example11" class="form-control"
                             placeholder="Monto" name="monto"/>
                             <input type="hidden" name="por" value="visitante">
                             <input type="hidden" name="idPartido" value= "${partido.idParttido}">
                      </div>
                            <input class="btn btn-primary" type="submit" name="Enviar datos" value="Apostar">                           
                  </form>
            </div>
                      <div class="col-md-4" style="color: #000000; padding-top: 70px">
                <h4>Fecha</h4>
                <p>${partido.fecha}</p>
                <p>${partido.idParttido}</p>
            </div>
        </div>
    
</div>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>