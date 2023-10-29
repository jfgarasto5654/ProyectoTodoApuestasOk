<nav class="navbar navbar-expand-lg">
  <div class="container-fluid">
    <a href="${pageContext.request.contextPath}">
      <img src="img/logoAP.jpg" id="logo-nav" class="img-fluid navbar-logo">
    </a>
    <a href="${pageContext.request.contextPath}" class="navbar-apuesta ">Apuesta</a>
    <span class="navbar-todocom">todo.com</span>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
  <li class="nav-item" >
    <a href="Index?action=inicioSesion" class="nav-link">Iniciar Sesion</a>
  </li>
  <li class="nav-item" >
    <a href="Index?action=newUsuarios" class="nav-link">Crear Usuario</a>
  </li>
  <li class="nav-item" >
    <a href="${pageContext.request.contextPath}/Partidos" class="nav-link">Partidos</a>
  </li>
      </ul>
    </div>
  </div>
</nav>

<hr id="lineadebajo-navbar">