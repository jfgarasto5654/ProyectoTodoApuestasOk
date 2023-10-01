<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apuesta Todo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="css/estilo.css">
</head>
    <body>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
              <img src="img/logoAP.jpg" id = "logo-nav"/>             
              <h1 class="navbar-apuesta">Apuesta</h1> <h1 class="navbar-todocom">todo.com</h1> 
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a id = "Home" class="nav-link active" aria-current="page" href="new_usuarios.jsp">Crear Usuario</a>
                  </li>
                </ul>
              </div>
            </div>
          </nav>

        <h1 id="titulo" >Inicio Sesion</h1>
        <form action="SvIngresoUsuario" method="POST">
            <p> <label>Usuario</label> <input type="text" name="usuario"></p>
            <p> <label>Contraseña</label> <input type="password" name="password"></p>
            <input type="submit" name="Enviar datos" value="Enviar datos">
       </form>
    </body>
</html>
