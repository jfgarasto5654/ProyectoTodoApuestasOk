package com.mycompany.apuestatodook;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SvIndex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino = null;
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "inicioSesion":
                    destino = "/WEB-INF/jsp/inicioSesion.jsp";
                    break;
                case "newUsuario":
                    destino = "/WEB-INF/jsp/newUsuario.jsp";
                    break;
            }
        }
        request.getRequestDispatcher(destino).forward(request, response);
    }

}