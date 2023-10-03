<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
          <img src="img/logoAP.jpg" id = "logo-nav">
          <h1 class="navbar-apuesta">Apuesta</h1> <h1 class="navbar-todocom">todo.com</h1> 
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a id = "Home" class="nav-link active" aria-current="page" href="inicioSesion.jsp">Iniciar Sesion</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="new_usuarios.jsp">Crear Usuario</a>
              </li>
             
            </ul>
          </div>
        </div>
      </nav>

      <ul class="nav justify-content-center">
        <li class="nav-item">
          <a class="nav-link active" id = "link-deportes" aria-current="page" href="#">Futbol</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" id = "link-deportes" href="#">Handball</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" id = "link-deportes" href="#">Golf</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>

        <h2 id = "bets">BETS DESTACADAS</h2>
        <div id="carouselExample" class="carousel slide">


      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="img/Boca-Racing-ESPN.jpg" class="d-block " alt="...">
        </div>
        <div class="carousel-item">
          <img src="img/Barcelona-Madrid-Aguero.jpg" class="d-block " alt="...">
        </div>
        <div class="carousel-item">
          <img src="img/espn-Final.jpg" class="d-block " alt="...">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
   <c:import url="componentesHTML/footer.jsp" /> 
</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>


</html>
