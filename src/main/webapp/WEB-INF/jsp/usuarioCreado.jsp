<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3;url=Index?action=inicioSesion">
        <title>ApuestaTodo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>


<c:import url="componentesHTML/navBar-Iniciado.jsp" />

<div class="container-agregarPartidos">
        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-body">
                        <form action="AdminPartidos" method="POST">
                            <h4 class="card-title">Cuenta Creada</h4>
                            <h1>FELICITACIONES</h1>
        <h1>SU CUENTA HA SIDO CREADA</h1>
        <h1>Gracias por unirte a la comunidad de Apuesta Todo</h1>
        <h3>Aposta con responsabilidad</h3>
        <h3>Estas siendo redireccionado</h3>
                            <button class="btn btn-success" type="submit">Agregar</button>
                        </form>
                    </div>
                </div>
        </div>
    </div>
   </div>
        
        
            
        <c:import url="componentesHTML/footer.jsp" /> 

</html>
