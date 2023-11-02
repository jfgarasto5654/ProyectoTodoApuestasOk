
package com.mycompany.apuestatodook.model;


public class Usuario{

    private int IDusuario;
    private String usuario;
    private String contrasenia;
    private double dinero;

    public Usuario(int IDusuario1, String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public double getDinero() {
        return dinero;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }


    public String getNombre() {
        return usuario;
    }

    public String getContrasena() {
        return contrasenia;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

}


