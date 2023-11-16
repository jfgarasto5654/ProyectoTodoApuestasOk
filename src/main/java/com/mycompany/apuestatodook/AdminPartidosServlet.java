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
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


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
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String local = request.getParameter("Local");
            String visitante = request.getParameter("Visitante");
            String fechaStr = request.getParameter("Fecha");
            
            SimpleDateFormat formatoFechaJSP = new SimpleDateFormat("yyyy-MM-dd"); // El formato depende de tu input date en el formulario
            java.util.Date fechaUtil = formatoFechaJSP.parse(fechaStr);

            // Convertir de java.util.Date a java.sql.Date
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            
            // Crear una instancia de PartidosDAO
            PartidoDAO partidosDAO = new PartidoDAO();
            
            // Llamar al método agregarPartido con los parámetros recibidos
            partidosDAO.agregarPartido(local, visitante, fechaSQL);
            
                request.setAttribute("hayError", true);
                request.setAttribute("mensajeError", "Partido agregado correctamente.");
            
            request.getRequestDispatcher("WEB-INF/jsp/adminPartidos.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AdminPartidosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}