/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
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
        add(new Partido("Real Madrid", "FC Barcelona", "01-11-2023", contador));
        add(new Partido("Manchester City", "Liverpool FC", "02-11-2023", contador));
        add(new Partido("Bayern Munich", "Borussia Dortmund", "03-11-2023", contador));
        add(new Partido("Paris Saint-Germain", "AC Milan", "04-11-2023", contador));
        add(new Partido("Juventus", "Inter Milan", "05-11-2023", contador));
        add(new Partido("Chelsea FC", "Arsenal FC", "06-11-2023", contador));
        add(new Partido("Atletico Madrid", "Sevilla FC", "07-11-2023", contador));
        add(new Partido("Borussia Monchengladbach", "Hertha Berlin", "08-11-2023", contador));
        add(new Partido("Ajax Amsterdam", "PSV Eindhoven", "09-11-2023", contador));
        add(new Partido("AS Roma", "SS Lazio", "10-11-2023", contador));
        add(new Partido("FC Porto", "SL Benfica", "11-11-2023", contador));
        add(new Partido("Tottenham Hotspur", "Manchester United", "12-11-2023", contador));
        add(new Partido("ACF Fiorentina", "Napoli", "13-11-2023", contador));
        add(new Partido("Everton FC", "Leeds United", "14-11-2023", contador));
        add(new Partido("Ajax Cape Town", "Kaizer Chiefs", "15-11-2023", contador));
    }
    

    public Partido getPartidoPorId(Integer id) {
        UtilExceptions.checkNumeroNegativo(id, "El ID no puede ser negativo");
        Partido partidoEncontrado = null;
        Iterator<Partido> it = this.partidos.iterator();
        while (it.hasNext() && partidoEncontrado == null) {
            Partido aux = it.next();
            if (aux.getIdParttido() == id) {
                partidoEncontrado = aux;
            }
        }
            UtilExceptions.checkObjetoNulo(partidoEncontrado, "No existe receta con id " + id);
        return partidoEncontrado;
    }
}
