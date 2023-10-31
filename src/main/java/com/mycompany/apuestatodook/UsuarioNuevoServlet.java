
package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NuevoUsuario", urlPatterns = {"/NuevoUsuario"})
public class UsuarioNuevoServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad= request.getParameter("edad");

        response.sendRedirect("Index?action=usuarioCreado");
    }
}
