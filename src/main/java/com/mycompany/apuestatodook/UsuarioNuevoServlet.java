
package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.PersonaDAO;
import com.mycompany.apuestatodook.model.Usuario;
import com.mycompany.apuestatodook.model.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NuevoUsuario", urlPatterns = {"/NuevoUsuario"})
public class UsuarioNuevoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        String email = request.getParameter("email");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edadStr = request.getParameter("edad");
        int edad = Integer.parseInt(edadStr);
        String dni = request.getParameter("dni");

        if (edad < 18) {
            // Manejo de error si la edad es menor de 18
        } else if (!password.equals(cpassword)) {
            // Manejo de error si las contraseñas no coinciden
        } else {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            int idUsuario = usuarioDAO.add(usuario, password);
            PersonaDAO personaDAO = new PersonaDAO();
            personaDAO.agregarPersona(idUsuario, email, nombre, apellido, edad, dni);
        }
    }
}
