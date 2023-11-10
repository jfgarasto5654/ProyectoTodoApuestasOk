
package com.mycompany.apuestatodook.filtros;


import com.mycompany.apuestatodook.filtros.UtilFilter;
import com.mycompany.apuestatodook.model.Apuesta;
import com.mycompany.apuestatodook.model.ApuestaDAO;
import com.mycompany.apuestatodook.model.Usuario;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        if (session != null && session.getAttribute("userLogueado") != null) {         
            Usuario userLogueado = (Usuario) session.getAttribute("userLogueado");
            if (userLogueado.getRol().equals("ADMIN")) {
                chain.doFilter(httpRequest, httpResponse); // Ir al siguiente en la cadena de filters
            } else {
                //session.invalidate();
                ApuestaDAO apuestaDAO = new ApuestaDAO();
                List<Apuesta> apuestas = apuestaDAO.getApuestasPorUsuario(userLogueado.getIDusuario());

                request.setAttribute("apuestas", apuestas);
                request.getRequestDispatcher("WEB-INF/jsp/apuestasMostrar.jsp").forward(request, response);
            }
        } else {
            UtilFilter.generarError(httpRequest, httpResponse, "Debe iniciar sesion para entrar aqui");
        }
    }
    
}
