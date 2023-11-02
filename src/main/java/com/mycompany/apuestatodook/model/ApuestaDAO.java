package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApuestaDAO {

    public void add(Apuesta apuesta) {
        String query = "INSERT INTO apuesta (monto, premio, por_quien, fk_id_usuario, fk_id_resultado, fk_id_partido) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = ConnectionPool.getInstance().getConnection(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setInt(1, apuesta.getMonto());
            preparedStatement.setInt(2, apuesta.getPremio());
            preparedStatement.setString(3, apuesta.getPor_quien());
            preparedStatement.setInt(4, apuesta.getIdUsuario());
            preparedStatement.setInt(5, apuesta.getIdResultado());
            preparedStatement.setInt(6, apuesta.getIdPartido());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}