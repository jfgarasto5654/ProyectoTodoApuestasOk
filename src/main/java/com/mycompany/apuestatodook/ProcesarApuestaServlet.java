package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Apuesta;
import com.mycompany.apuestatodook.model.ApuestaDAO;
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

@WebServlet(name = "SvprocesarApuesta", urlPatterns = {"/SvprocesarApuesta"})
public class ProcesarApuestaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = (Usuario) request.getSession().getAttribute("userLogueado");

        if (usuario != null) {
            String idPartido = request.getParameter("idPartido");
            String por = request.getParameter("por");
            int idUsuario = usuario.getIDusuario();

            String montoSTR = request.getParameter("monto");
            int monto = Integer.parseInt(montoSTR);

            double dineroDisponible = usuario.getDinero();
            if (monto > dineroDisponible) {
                request.setAttribute("hayError", true);
                request.setAttribute("mensajeError", "Saldo insuficiente para la apuesta.");
                request.getRequestDispatcher("WEB-INF/jsp/apuesta.jsp").forward(request, response);
                return;
            }

            Apuesta apuesta = new Apuesta(monto, por, idUsuario, Integer.parseInt(idPartido));

            request.setAttribute("apuesta", apuesta);
            ApuestaDAO apuestaDAO = new ApuestaDAO();
            apuestaDAO.add(apuesta);

            PartidoDAO partidoDAO = new PartidoDAO();

            int partidoID = Integer.parseInt(idPartido);

            Partido partido = partidoDAO.getPartidoPorId(partidoID);

            request.setAttribute("partido", partido);

            int premio = monto * 2;
            request.setAttribute("premio", premio);
            double nuevoDinero = dineroDisponible - monto;
            usuario.setDinero(nuevoDinero); 

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.updateDinero(usuario);
            request.getSession().setAttribute("userLogueado", usuario);


            request.getRequestDispatcher("WEB-INF/jsp/ApuestaCreada.jsp").forward(request, response);
        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Ingrese Nuevamente!");
            request.getRequestDispatcher("WEB-INF/jsp/iniciosesion.jsp").forward(request, response);
        }
    }
}
