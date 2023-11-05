/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                System.out.println(validado);
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

    public int add(String usuario, String contrasenia) {
        String query = "INSERT INTO usuario (usuario, contrasenia) VALUES (?, ?)";
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, contrasenia);
            preparedStatement.executeUpdate();

            ResultSet key = preparedStatement.getGeneratedKeys();
            if (key.next()) {
                return key.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de usuario generado automáticamente.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
    public double getDineroPorIdUsuario (Integer Id) {
        
        String query = "SELECT dinero FROM usuario WHERE id_usuario = ?";
        
        double dinero = 0.0;
        
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            
            preparedStatement.setInt(1, Id);
            
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                
                if (resultSet.next()) { 
                    dinero = resultSet.getDouble(4);
                }  
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return dinero;
    }

    
}
    

