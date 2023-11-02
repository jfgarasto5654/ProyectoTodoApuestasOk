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

    private String idApuesta;
    private int monto;
    private int premio;
    private String por_quien;
    private String idPersona;
    private String idResultado;

    public Apuesta(String idApuesta, int monto, int premio, String por_quien, String idPersona, String idResultado) {
        this.idApuesta = idApuesta;
        this.monto = monto;
        this.premio = monto*2;
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

    public String getIdPersona() {
        return idPersona;
    }

    public String getIdResultado() {
        return idResultado;
    }
    
    
    
    
    
    
    
    


    
}
