
package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDAO {
    public void agregarPersona(int idUsuario, String nombre, String apellido, int edad, String dni) {
        String query = "INSERT INTO persona ( nombre, apellido, edad, dni, fk_id_usuario) VALUES (? , ?, ?, ?, ?)";
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);
            preparedStatement.setString(4, dni);
            preparedStatement.setInt(5, idUsuario);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}