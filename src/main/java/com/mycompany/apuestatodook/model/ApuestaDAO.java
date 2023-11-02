package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApuestaDAO {

    public void add(Apuesta apuesta) {
        String query = "INSERT INTO apuesta (monto, por_quien, fk_id_usuario, fk_id_partido) VALUES (?, ?, ?, ?)";
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setInt(1, apuesta.getMonto());
            preparedStatement.setString(2, apuesta.getPor_quien());
            preparedStatement.setInt(3, apuesta.getIdUsuario());
            preparedStatement.setInt(4, apuesta.getIdPartido());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}