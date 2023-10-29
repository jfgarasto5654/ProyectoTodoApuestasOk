
package com.mycompany.apuestatodook.modelo;


public class Usuario {
    // Atributos
    private int IDusuario;
    private String nombre;
    private String contrasena;

    // Constructor
    public Usuario(int IDusuario, String nombre, String contrasena) {
        this.IDusuario = IDusuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Métodos para acceder a los atributos
    public int getIDusuario() {
        return IDusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Métodos para modificar los atributos
    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario [IDusuario=" + IDusuario + ", nombre=" + nombre + ", contrasena=" + contrasena + "]";
    }

    // Otros métodos específicos de la clase Usuario, si es necesario
}


