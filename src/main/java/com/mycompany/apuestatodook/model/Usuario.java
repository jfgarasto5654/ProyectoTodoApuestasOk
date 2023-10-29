
package com.mycompany.apuestatodook.model;


public class Usuario {
    // Atributos
    private int IDusuario;
    private String usuario;
    private String contrasenia;

    // Constructor
    public Usuario(int IDusuario, String usuario, String contrasenia) {
        this.IDusuario = IDusuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Métodos para acceder a los atributos
    public int getIDusuario() {
        return IDusuario;
    }

    public String getNombre() {
        return usuario;
    }

    public String getContrasena() {
        return contrasenia;
    }

    // Métodos para modificar los atributos
    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public void setNombre(String nombre) {
        this.usuario = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasenia = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario [IDusuario=" + IDusuario + ", nombre=" + usuario + ", contrasena=" + contrasenia + "]";
    }

    // Otros métodos específicos de la clase Usuario, si es necesario
}


