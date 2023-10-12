/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.apuestatodook;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import modelo.Partido;
import modelo.partidosHarcodeados;

/**
 *
 * @author Tango
 */
@WebServlet(name = "SvApuesta", urlPatterns = {"/Apuesta"})
public class SvApuesta extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        partidosHarcodeados partidos = new partidosHarcodeados(); // Crear una instancia de partidosHarcodeados
        List<Partido> listaDePartidos = partidos.getAll(); // Obtén la lista de partidos desde la instancia

        String partidoId = request.getParameter("id");
        // Obtén el partido por su ID desde la lista de partidos
        Partido partido = obtenerPartidoPorId(partidoId, listaDePartidos);

        request.setAttribute("partido", partido);
        request.getRequestDispatcher("/WEB-INF/jsp/apuesta.jsp").forward(request, response);
    }

    // Método para obtener el partido por su ID desde la lista de partidos
    private Partido obtenerPartidoPorId(String partidoId, List<Partido> listaDePartidos) {
        for (Partido partido : listaDePartidos) {
            if (partido.getIdParttido() == Integer.parseInt(partidoId)) {
                return partido;
            }
        }
        return null; // Maneja el caso en el que el partido no se encuentra
    }
}