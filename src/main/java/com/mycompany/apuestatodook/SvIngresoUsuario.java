
package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SvIngresosoUsuario", urlPatterns = {"/SvIngresoUsuario"})
public class SvIngresoUsuario extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("password");

        
        System.out.println(usuario);
        System.out.println(contrasenia);
        
        String usuario1 = "admin";
        String contrasenia1 = "1234";
        if (usuario1.equalsIgnoreCase(usuario)&&(contrasenia.equals(contrasenia1)))
        response.sendRedirect("Index?action=principalIniciado");
        else response.sendRedirect("Index?action=errorIngresoUsuario");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
