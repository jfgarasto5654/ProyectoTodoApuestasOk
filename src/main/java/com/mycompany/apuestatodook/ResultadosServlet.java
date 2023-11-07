package com.mycompany.apuestatodook;


import com.mycompany.apuestatodook.model.Resultado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.mycompany.apuestatodook.model.ResultadoDAO;
import java.util.List;

@WebServlet(name = "SvResultados", urlPatterns = {"/Resultados"})
public class ResultadosServlet extends HttpServlet {
    

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ResultadoDAO resultadoDAO = new ResultadoDAO();
    String destino;
     
    List<Resultado> resultados = resultadoDAO.getAllResultados();
 
    request.setAttribute("resultados", resultados);


    destino = "WEB-INF/jsp/resultados.jsp";

    request.getRequestDispatcher(destino).forward(request, response);
}
}