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

@WebServlet(name = "SvprocesarApuesta", urlPatterns = {"/SvprocesarApuesta"})
public class ProcesarApuestaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idPartido = request.getParameter("idPartido");
        String por = request.getParameter("por");
        Usuario usuario = (Usuario) request.getSession().getAttribute("userLogueado");

        if (usuario != null) {
            int idUsuario = usuario.getIDusuario();

            String montoSTR = request.getParameter("monto");
            int monto = Integer.parseInt(montoSTR);

            System.out.println("ID de Partido: " + idPartido);
            System.out.println("Por: " + por);
            System.out.println("ID de Usuario: " + idUsuario);
            System.out.println("Monto: " + monto);
            
            Apuesta apuesta = new Apuesta( monto, por, idUsuario, Integer.parseInt(idPartido));

            ApuestaDAO apuestaDAO = new ApuestaDAO();
            apuestaDAO.add(apuesta);

        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Ingrese Nuevamente!");
            request.getRequestDispatcher("/WEB-INF/jsp/iniciosesion").forward(request, response);
        }

        request.getRequestDispatcher("/WEB-INF/jsp/usuarioCreado.jsp").forward(request, response);
    }
}