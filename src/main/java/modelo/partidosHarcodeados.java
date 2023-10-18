package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class partidosHarcodeados {
    private List<Partido> partidos;

    public partidosHarcodeados() {
        this.partidos = new ArrayList<>();
        cargarPartidosFake();
    }
     
        public void add(Partido partido) {
        partidos.add(partido);
    }
        
    public List<Partido> getAll() {
        return new ArrayList<>(this.partidos);
    }
    
    private void cargarPartidosFake() {
        add(new Partido("Real Madrid", "FC Barcelona", "01-11-2023", 1));
        add(new Partido("Manchester City", "Liverpool FC", "02-11-2023", 2));
        add(new Partido("Bayern Munich", "Borussia Dortmund", "03-11-2023", 3));
        add(new Partido("Paris Saint-Germain", "AC Milan", "04-11-2023", 4));
        add(new Partido("Juventus", "Inter Milan", "05-11-2023", 5));
        add(new Partido("Chelsea FC", "Arsenal FC", "06-11-2023", 6));
        add(new Partido("Atletico Madrid", "Sevilla FC", "07-11-2023", 7));
        add(new Partido("Borussia Monchengladbach", "Hertha Berlin", "08-11-2023", 8));
        add(new Partido("Ajax Amsterdam", "PSV Eindhoven", "09-11-2023", 9));
        add(new Partido("AS Roma", "SS Lazio", "10-11-2023", 10));
        add(new Partido("FC Porto", "SL Benfica", "11-11-2023", 11));
        add(new Partido("Tottenham Hotspur", "Manchester United", "12-11-2023", 12));
        add(new Partido("ACF Fiorentina", "Napoli", "13-11-2023", 13));
        add(new Partido("Everton FC", "Leeds United", "14-11-2023", 14));
        add(new Partido("Ajax Cape Town", "Kaizer Chiefs", "15-11-2023", 15));
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
