package com.mycompany.apuestatodook.model;


public class Apuesta {
    private int idApuesta;
    private int monto;
    private int premio;
    private String por_quien;
    private int idUsuario;
    private int idResultado;
    private int idPartido;

    public Apuesta(int idApuesta, int monto, int premio, String por_quien, int idUsuario, int idResultado, int idPartido) {
        this.idApuesta = idApuesta;
        this.monto = monto;
        this.premio = premio;
        this.por_quien = por_quien;
        this.idUsuario = idUsuario;
        this.idResultado = idResultado;
        this.idPartido = idPartido;
    }

    // Métodos getter y setter
    public int getIdApuesta() {
        return idApuesta;
    }

    public int getMonto() {
        return monto;
    }

    public int getPremio() {
        return premio;
    }

    public String getPor_quien() {
        return por_quien;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
}