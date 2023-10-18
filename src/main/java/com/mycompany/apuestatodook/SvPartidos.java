package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import modelo.partidosHarcodeados;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "SvPartidos", urlPatterns = {"/Partidos"})
public class SvPartidos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        partidosHarcodeados PartidoDAO = new partidosHarcodeados();
        String destino;
        
        request.setAttribute("listaDePartidos", PartidoDAO.getAll());
        destino = "WEB-INF/jsp/partidos.jsp";
        
        request.getRequestDispatcher(destino).forward(request, response);
    }

   



}
