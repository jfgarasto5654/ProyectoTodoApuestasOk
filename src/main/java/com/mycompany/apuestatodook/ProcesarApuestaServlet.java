package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Apuesta;
import com.mycompany.apuestatodook.model.ApuestaDAO;
import com.mycompany.apuestatodook.model.Partido;
import com.mycompany.apuestatodook.model.PartidoDAO;
import com.mycompany.apuestatodook.model.Resultado;
import com.mycompany.apuestatodook.model.ResultadoDAO;
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
                         System.out.println("bandera");
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
            
            ResultadoDAO resultadoDAO = new ResultadoDAO();
            int idPartidoParam = Integer.parseInt(idPartido);
            int idResultado = resultadoDAO.getIdResultadoByIdPartido(idPartidoParam);

            Apuesta apuesta = new Apuesta(monto, por, idUsuario, Integer.parseInt(idPartido), idResultado);

            request.setAttribute("apuesta", apuesta);
            ApuestaDAO apuestaDAO = new ApuestaDAO();
            apuestaDAO.add(apuesta);
            
            int idPartidonum = apuesta.getIdPartido();
            
            Resultado resultadoPartido = resultadoDAO.getResultadoByIdPartido(idPartidonum);


            if (resultadoPartido != null) {
                if (resultadoPartido.getGanador().equals(apuesta.getPor_quien())) {
                    // El usuario ha ganado la apuesta
                    int premio = apuesta.getMonto() * 2;
                    usuario.setDinero(usuario.getDinero() + premio);
                    apuesta.setEstado('G'); // G para indicar ganada
                    request.setAttribute("hayGanador", true);
                } else {
                    // El usuario ha perdido la apuesta
                    apuesta.setEstado('P'); // P para indicar perdida
                    request.setAttribute("hayPerdedor", true);
                }

                // Actualizar el estado en la base de datos
                apuestaDAO.updateEstado(apuesta);
                // Actualizar el dinero del usuario en la base de datos
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                usuarioDAO.updateDinero(usuario);
            }
            
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
