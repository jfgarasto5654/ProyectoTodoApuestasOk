/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apuestatodook.model;

/**
 *
 * @author Juan
 */
public class Apuesta {

    private int idApuesta;
    private int monto;
    private int premio;
    private String por_quien;
    private int idPersona;
    private int idResultado;

    public Apuesta(int idApuesta, int monto, int premio, String por_quien, int idPersona, int idResultado) {
        this.idApuesta = idApuesta;
        this.monto = monto;
        this.premio = premio;
        this.por_quien = por_quien;
        this.idPersona = idPersona;
        this.idResultado = idResultado;
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
        return idPersona;
    }

    public int getIdResultado() {
        return idResultado;
    }
    
    
    
    
    
    
    
    


    
}
