package com.mycompany.apuestatodook.model;


public class Partido {
    private String local;
    private String visitante;
    private String fecha;
    private int idParttido;

    public Partido(String local, String visitante, String fecha, int idParttido) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.idParttido = idParttido;
    }
    
    

    public void setLocal(String local) {
        this.local = local;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdParttido(int idParttido) {
        this.idParttido = idParttido;
    }

    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdParttido() {
        return idParttido;
    }
    
    
   

    
    
    
    
}
