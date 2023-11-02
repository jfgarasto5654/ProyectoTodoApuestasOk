
package com.mycompany.apuestatodook;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Svprocesar_apuesta", urlPatterns = {"/Svprocesar_apuesta"})
public class ProcesarApuestaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String por = req.getParameter("por");
        String idPartido = req.getParameter("IdParttido");
        String montoSTR = req.getParameter("monto");
        int monto = Integer.parseInt(montoSTR);
        
            System.out.println(" Se aposto por el:  " + por);
            System.out.println("El id del partido apostado es:  " + idPartido);
            System.out.println("El monto apostado es:  " + monto);
            
        req.getRequestDispatcher("/WEB-INF/jsp/usuarioCreado.jsp").forward(req, resp);    
    }

    
}
