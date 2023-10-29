
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

@WebServlet(name = "SvIngresosoUsuario", urlPatterns = {"/IngresoUsuario"})
public class IngresoUsuarioServlet extends HttpServlet {
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Si viene de un filter, será con una ruta como "/login?origen=/perfil" o "/login?origen=/restringida"
        String origen = request.getParameter("origen"); // Obtengo el origen
        request.setAttribute("deDondeViene", origen); // Lo seteo como valor para poner en el form del .jsp (ir a verlo)
        request.getRequestDispatcher("/WEB-INF/jsp/inicioSesion.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("usuario");
        String p = request.getParameter("Contraseña");
        Usuario user = new UsuarioDAO().autenticar(n, p);
        if (user != null) {
      
            String haciaDondeIba = request.getParameter("deDondeViene");
            HttpSession session = request.getSession(); // Pido la sesión actual
            session.setMaxInactiveInterval(10); // Seteo tiempo máximo de inactividad (en segundos)
            session.setAttribute("userLogueado", user); // Asigno la info del usuario a la sesión
           if (haciaDondeIba != null) {
                response.sendRedirect(request.getContextPath() + haciaDondeIba);
            } else {
                response.sendRedirect(request.getContextPath() + "/principaliniciado.jsp");            
            }
            }else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Credenciales incorrectas!");
            doGet(request, response);

        }
    }
    
    

}
