
package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Usuario;
import com.mycompany.apuestatodook.model.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SvIngresosoUsuario", urlPatterns = {"/SvIngresoUsuario"})
public class IngresoUsuarioServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("usuario");
        String p = request.getParameter("Contraseña");
        Usuario user = new UsuarioDAO().autenticar(n, p);
        if (user != null) {
            // ¿Recordás el input oculto en el .jsp? Lo obtengo y lo guardo
            String haciaDondeIba = request.getParameter("deDondeViene");
            HttpSession session = request.getSession(); // Pido la sesión actual
            session.setMaxInactiveInterval(10); // Seteo tiempo máximo de inactividad (en segundos)
            session.setAttribute("userLogueado", user); // Asigno la info del usuario a la sesión
            // Lo mando hacia donde quería ir
            response.sendRedirect(request.getContextPath() + haciaDondeIba);
        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Credenciales incorrectas!");
            doGet(request, response);
        }
    }
    
    

}
