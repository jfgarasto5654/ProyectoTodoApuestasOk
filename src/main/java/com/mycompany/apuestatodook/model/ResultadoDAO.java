package com.mycompany.apuestatodook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultadoDAO {
    public List<Resultado> getAllResultados() {
        List<Resultado> resultados = new ArrayList<>();
        String query = "SELECT * FROM resultado";
        
        try (Connection con = ConnectionPool.getInstance().getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int idResultado = resultSet.getInt("id_resultado");
                String ganador = resultSet.getString("ganador");
                int idPartido = resultSet.getInt("fk_id_partido");

                Resultado resultado = new Resultado(idResultado, ganador, idPartido);
                resultados.add(resultado);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return resultados;
    }
public Resultado getResultadoByIdPartido(int idPartido) {
    String query = "SELECT * FROM resultado WHERE fk_id_partido = ?";
    Resultado resultado = null;

    try (Connection con = ConnectionPool.getInstance().getConnection();
         PreparedStatement preparedStatement = con.prepareStatement(query)) {
        preparedStatement.setInt(1, idPartido);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                int idResultado = resultSet.getInt("id_resultado");
                String ganador = resultSet.getString("ganador");
                resultado = new Resultado(idResultado, ganador, idPartido);
            }
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    return resultado;
}
}