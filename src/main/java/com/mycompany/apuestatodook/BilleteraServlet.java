package com.mycompany.apuestatodook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SvBilletera", urlPatterns = "/billetera")

public class BilleteraServlet extends HttpServlet{
    
   
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp){
        
    }
    
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
    }
    
}
