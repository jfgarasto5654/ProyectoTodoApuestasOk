package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Apuesta;
import com.mycompany.apuestatodook.model.ApuestaDAO;
import com.mycompany.apuestatodook.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ApuestaMostrarServlet", urlPatterns = {"/ApuestasMostrar"})
public class ApuestaMostrarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtén el usuario actual de la sesión
        Usuario usuario = (Usuario) request.getSession().getAttribute("userLogueado");
        
        if (usuario != null) {
            // Utiliza un DAO para obtener las apuestas del usuario
            ApuestaDAO apuestaDAO = new ApuestaDAO();
            List<Apuesta> apuestas = apuestaDAO.getApuestasPorUsuario(usuario.getIDusuario());

            // Establece la lista de apuestas como atributo en la solicitud
            request.setAttribute("apuestas", apuestas);

            // Redirige a un JSP que mostrará la lista de apuestas
            request.getRequestDispatcher("WEB-INF/jsp/apuestasMostrar.jsp").forward(request, response);
        } else {
            // Maneja el caso en el que el usuario no esté autenticado
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Por favor, inicie sesión.");
            request.getRequestDispatcher("WEB-INF/jsp/iniciosesion.jsp").forward(request, response);
        }
    }
}