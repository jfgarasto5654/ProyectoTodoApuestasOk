package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Partido;
import com.mycompany.apuestatodook.model.PartidoDAO;
import com.mycompany.apuestatodook.model.Usuario;
import com.mycompany.apuestatodook.model.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SvAdminPartidos", urlPatterns = "/AdminPartidos")

public class AdminPartidosServlet extends HttpServlet{
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String destino;
        
        destino = "WEB-INF/jsp/adminPartidos.jsp";
        
        request.getRequestDispatcher(destino).forward(request, response);
        
    }
 
    
    
    @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String local = req.getParameter("Local");
    String visitante = req.getParameter("Visitante");
    String fecha = req.getParameter("Fecha");
    
    Partido partidoAgregar = new Partido(local, visitante, fecha);
    PartidoDAO partidoDAO = new PartidoDAO();
    
    
    
    }
    
} 

