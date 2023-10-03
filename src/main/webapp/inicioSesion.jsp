<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-No-Iniciado.jsp" />

        <h1 id="titulo" >Inicio Sesion</h1>
        <form action="SvIngresoUsuario" method="POST">
            <p> <label>Usuario</label> <input type="text" name="usuario"></p>
            <p> <label>Contraseña</label> <input type="password" name="password"></p>
            <input type="submit" name="Enviar datos" value="Enviar datos">
       </form>
        <c:import url="componentesHTML/footer.jsp" /> 
    </body>
</html>
