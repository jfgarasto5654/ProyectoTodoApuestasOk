package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import modelo.Partido;
import modelo.partidosHarcodeados;

@WebServlet(name = "SvApuesta", urlPatterns = {"/Apuesta"})
public class SvApuesta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int partidoId = Integer.parseInt(request.getParameter("id"));
        
        partidosHarcodeados PartidoDAO = new partidosHarcodeados();
        
        Partido partido = PartidoDAO.getPartidoPorId(partidoId);
        
        request.setAttribute("partido", partido);
       
        request.getRequestDispatcher("WEB-INF/jsp/apuesta.jsp").forward(request, response);
    }
}