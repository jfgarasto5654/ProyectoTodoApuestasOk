package com.mycompany.apuestatodook.model;


public class Resultado {
    private int idResultado;
    private String ganador;
    private int idPartido;

    public Resultado(int idResultado, String ganador, int idPartido) {
        this.idResultado = idResultado;
        this.ganador = ganador;
        this.idPartido = idPartido;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public String getGanador() {
        return ganador;
    }

    public int getIdPartido() {
        return idPartido;
    }
}