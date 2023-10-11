/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class partidosHarcodeados {
    private static int contador = 1;
    private List<Partido> partidos;

    public partidosHarcodeados() {
        this.partidos = new ArrayList<>();
        cargarPartidosFake();
    }
     
        public void add(Partido partido) {
        partido.setIdParttido(contador);
        partidos.add(partido);
        contador++;
    }
        
    public List<Partido> getAll() {
        return new ArrayList<>(this.partidos);
    }
    
    private void cargarPartidosFake() {
        add(new Partido("River","boca","12-05-2023",contador ));
        add(new Partido("Racing","independiente","20-30-2502",contador ));
        add(new Partido("San Lorenzo","Huracan","02-65-8189",contador ));
    }
}
