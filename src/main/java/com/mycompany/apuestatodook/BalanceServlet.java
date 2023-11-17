package com.mycompany.apuestatodook;


import com.mycompany.apuestatodook.model.Apuesta;
import com.mycompany.apuestatodook.model.ApuestaDAO;
import com.mycompany.apuestatodook.model.Partido;
import com.mycompany.apuestatodook.model.PartidoDAO;
import com.mycompany.apuestatodook.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvResultados", urlPatterns = {"/Balance"})
public class BalanceServlet extends HttpServlet {
    

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ApuestaDAO apuestaDAO = new ApuestaDAO();
    String destino;
     
    List<Apuesta> apuestasPerdidas = apuestaDAO.getAllApuestasBalance();
 
    request.setAttribute("apuestasPerdidas", apuestasPerdidas);

    destino = "WEB-INF/jsp/balance.jsp";
    
    for (Apuesta apuestaPerdida : apuestasPerdidas) {
        System.out.println(apuestaPerdida.getMonto());   
    }
    
    request.getRequestDispatcher(destino).forward(request, response);
    }
}