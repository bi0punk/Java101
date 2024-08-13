package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {

    public void agregarPais(Pais pais) {
        String sql = "INSERT INTO paises (nombre_pais, capital) VALUES (?, ?)";
        try (Connection conn = ConexionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pais.getNombrePais());
            pstmt.setString(2, pais.getCapital());
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Pais> obtenerPaises() {
        List<Pais> paises = new ArrayList<>();
        String sql = "SELECT * FROM paises";
        try (Connection conn = ConexionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Pais pais = new Pais(rs.getInt("id"), rs.getString("nombre_pais"), rs.getString("capital"));
                paises.add(pais);
            }
        } catch (SQLException e) {
        }
        return paises;
    }

    public void modificarPais(Pais pais) {
        String sql = "UPDATE paises SET nombre_pais = ?, capital = ? WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pais.getNombrePais());
            pstmt.setString(2, pais.getCapital());
            pstmt.setInt(3, pais.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void eliminarPais(int id) {
        String sql = "DELETE FROM paises WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    Pais obtenerPaisPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
