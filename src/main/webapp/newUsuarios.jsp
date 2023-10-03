<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-No-Iniciado.jsp" />

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
