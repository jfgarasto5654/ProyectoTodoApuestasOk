<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ApuestaTodo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>

<c:import url="componentesHTML/navBar-Iniciado.jsp" />    
            
                <div class="card">               
                <div class="card-body">
                  <h3 class="card-title">Felicitaciones su apuesta ha sido creada</h3>
                  <h3 class="card-title">Datos del partido</h3>
                  <h5 class="card-text">${partido.local} vs ${partido.visitante}</h5>
                  <h5 class="card-text">${partido.fecha}</h5>
                  <h5 class="card-text">Su apuesta ha sido de $ ${apuesta.monto} por el equipo ${apuesta.por_quien}</h3>
                  <h5 class="card-text">En caso de ganar su premio sera de $ ${premio}</h5>
                 
                  <a style="padding: 10px" href="#" class="btn btn-primary">Seguir apostando</a>
                </div>
                  
                  <div class="card-header">
                  Gracias por confiar en nosotros
                </div>
                  
              </div>           
            
        
            
        <c:import url="componentesHTML/footer.jsp" /> 
</html>
