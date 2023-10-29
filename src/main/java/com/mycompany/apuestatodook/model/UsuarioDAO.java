/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class UsuarioDAO {

     
 public List<Usuario> getAll() {
        List<Usuario>usuarios = new LinkedList();
        String query = "SELECT * FROM usuario";
        try(Connection con = ConnectionPool.getInstance().getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();)
        {
            while(rs.next()){
                usuarios.add(rsRowToUsuario(rs));
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return usuarios;
    }
 
    public Usuario autenticar(String usuario, String contrasenia) {
    String query = "SELECT * FROM usuario WHERE usuario = ? AND contrasenia = ?";
    Usuario validado = null;
    try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
        preparedStatement.setString(1, usuario);
        preparedStatement.setString(2, contrasenia);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                validado = rsRowToUsuario(resultSet);
            }
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    return validado;
}
 
  private Usuario rsRowToUsuario(ResultSet rs) throws SQLException {
     
       int IDusuario = rs.getInt(1);
       String usuario = rs.getString(2);
       String contrasenia = rs.getString(3);
       return new Usuario(IDusuario,usuario, contrasenia);
    }
}
