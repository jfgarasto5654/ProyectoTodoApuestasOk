package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.management.Query;
import modelo.partidosHarcodeados;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "SvPartidos", urlPatterns = {"/Partidos"})
public class SvPartidos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvPartidos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvPartidos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
