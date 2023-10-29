package com.mycompany.apuestatodook.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PartidoDAO {
    private List<Partido> partidos;

    public PartidoDAO() {
        this.partidos = new ArrayList<>();
        
    }
     
        public void add(Partido partido) {
        partidos.add(partido);
    }
        
    public List<Partido> getAll() {
        List<Partido>partidos = new LinkedList();
        String query = "SELECT * FROM partido";
        try(Connection con = ConnectionPool.getInstance().getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();)
        {
            while(rs.next()){
                partidos.add(rsRowToPartido(rs));
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return partidos;
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

    private Partido rsRowToPartido(ResultSet rs) throws SQLException {
       int id = rs.getInt(1);
       String local = rs.getString(2);
       String visitante = rs.getString(3);
       String fecha = rs.getString(4);
       return new Partido(local, visitante, fecha, id);
    }
}
