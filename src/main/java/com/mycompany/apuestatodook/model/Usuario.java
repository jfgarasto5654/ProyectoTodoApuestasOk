
package com.mycompany.apuestatodook.model;


public class Usuario {

    private int IDusuario;
    private String usuario;
    private String contrasenia;

    public Usuario(int IDusuario1, String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
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

    @Override
    public String toString() {
        return "Usuario [IDusuario=" + IDusuario + ", nombre=" + usuario + ", contrasena=" + contrasenia + "]";
    }

}


