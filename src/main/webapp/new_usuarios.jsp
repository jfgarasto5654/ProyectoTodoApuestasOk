<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
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
                    <a id = "Home" class="nav-link active" aria-current="page" href="inicioSesion.jsp">Iniciar Sesion</a>
                  </li>
                </ul>
              </div>
            </div>
          </nav>

        <h1 id="titulo" >NUEVO USUARIO</h1>
        <form action="Svusuarios" method="POST">
            <p> <label>DNI</label> <input type="text" name="dni"></p>
            <p> <label>NOMBRE</label> <input type="text" name="nombre"></p>
            <p> <label>APELLIDO</label> <input type="text" name="apellido"></p>
            <p> <label>EDAD</label> <input type="text" name="edad"></p>
            <input type="submit" name="Enviar datos" value="Enviar datos">
       </form>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>
