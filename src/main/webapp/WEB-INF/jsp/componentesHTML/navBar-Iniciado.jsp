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
    <a href="${pageContext.request.contextPath}/Partidos" class="nav-link">Partidos</a>
  </li>
  <li class="nav-item" >
    <a href="Index?action=billetera" class="nav-link">billetera</a>
  </li>
  <li class="nav-item" >
    <a href="Index?action=Resultados" class="nav-link">Partidos</a>
  </li>
  <li class="nav-item" >
    <a href="Index?action=Apuestas" class="nav-link">Apuestas</a>
  </li>
  <li class="nav-item" >
    <a href="${pageContext.request.contextPath}/Salir" class="nav-link">Salir</a>
  </li>
</ul>
    </div>
  </div>
</nav>

<hr id="lineadebajo-navbar">