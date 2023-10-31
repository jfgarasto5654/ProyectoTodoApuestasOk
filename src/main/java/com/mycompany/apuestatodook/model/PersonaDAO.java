
package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDAO {
    public void agregarPersona(int idUsuario, String email, String nombre, String apellido, int edad, String dni) {
        String query = "INSERT INTO persona (email, nombre, apellido, edad, fk_id_usuario) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellido);
            preparedStatement.setInt(4, edad);
            preparedStatement.setInt(5, idUsuario);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}