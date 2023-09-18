
package com.mycompany.apuestatodook;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Svusuarios", urlPatterns = {"/Svusuarios"})
public class Svusuarios extends HttpServlet {


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
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        
        System.out.println(dni);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        
        if(edad.equals("18")){
            System.out.println("TIENE 18 AÑOS");
        }
        
        response.sendRedirect("usuarioCreado.jsp");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
