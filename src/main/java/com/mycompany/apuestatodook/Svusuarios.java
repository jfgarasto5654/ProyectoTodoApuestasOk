
package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Svusuarios", urlPatterns = {"/Svusuarios"})
public class Svusuarios extends HttpServlet {


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
        
        System.out.println(usuario);
        System.out.println(email);
        System.out.println(password);
        System.out.println(cpassword);

        response.sendRedirect("usuarioCreado.jsp");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
