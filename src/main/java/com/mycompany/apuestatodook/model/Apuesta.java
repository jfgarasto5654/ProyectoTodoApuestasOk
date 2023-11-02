/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apuestatodook.model;

import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Apuesta {

    private int idApuesta;
    private int monto;
    private int premio;
    private String por_quien;
    private int idUsuario;
    private int idResultado;
    private int idPartido;

    public Apuesta(int idApuesta, int monto, int premio, String por_quien, int idUsuario, int idResultado) {
        this.idApuesta = idApuesta;
        this.monto = monto;
        this.premio = premio;
        this.por_quien = por_quien;
        this.idUsuario = idUsuario;
        this.idResultado = idResultado;
        this.idPartido = idPartido;
    }

    public int getIdApuesta() {
        return idApuesta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartdio) {
        this.idPartido = idPartido;
    }
    

    public int getMonto() {
        return monto;
    }

    public String getPor_quien() {
        return por_quien;
    }
    

    public int getPremio() {
        return premio;
    }

    public int getIdPersona() {
        return idUsuario;
    }

    public int getIdResultado() {
        return idResultado;
    }   
    
}
