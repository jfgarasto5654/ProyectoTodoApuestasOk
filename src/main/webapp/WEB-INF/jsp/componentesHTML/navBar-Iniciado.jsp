<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    
    <form class="d-flex">
                <c:choose>
                    <c:when test="${userLogueado == null}">
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/IngresoUsuario">Login</a>
                    </c:when>
                    <c:otherwise>
                        <a class="btn btn-danger" href="${pageContext.request.contextPath}/logout">Logout</a>
                    </c:otherwise>
                </c:choose> 
            </form>

    
  </div>
</nav

<hr id="lineadebajo-navbar">