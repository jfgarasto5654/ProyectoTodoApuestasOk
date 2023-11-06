package com.mycompany.apuestatodook;

import com.mycompany.apuestatodook.model.Usuario;
import com.mycompany.apuestatodook.model.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SvBilletera", urlPatterns = "/Billetera")

public class BilleteraServlet extends HttpServlet{
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String destino;
        
        Usuario usuario = (Usuario)request.getSession().getAttribute("userLogueado"); 
        
        int IDusuario = usuario.getIDusuario();

        double dineroDisponible = usuarioDAO.getDineroPorIdUsuario(IDusuario);
        
        request.setAttribute("dinero", dineroDisponible );
        
        destino = "WEB-INF/jsp/billetera.jsp";
        
        request.getRequestDispatcher(destino).forward(request, response);
    }
 
    
    
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        Usuario usuario = (Usuario)req.getSession().getAttribute("userLogueado"); 
                 
        String operacion = req.getParameter("Modificar");
        
        String montoSTR = req.getParameter("monto");
        double monto =  Integer.parseInt(montoSTR);
        double dineroEnLaCuenta = usuario.getDinero();
        
        if(operacion.equals("ingreso")){
            
            dineroEnLaCuenta+= monto;              
        }
        else{
            dineroEnLaCuenta-= monto; 
        }
        
        usuario.setDinero(dineroEnLaCuenta); // actualizo el atributo dinero del objeto usuario
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.updateDinero(usuario); // actualizo el dinero (tabla usuario) en la base de datos
        
        req.setAttribute("dinero", dineroEnLaCuenta);
        
        req.getRequestDispatcher("WEB-INF/jsp/billetera.jsp").forward(req, resp);

    }
    
} 

