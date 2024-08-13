package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mariadb://localhost:3306/pais";
    private static final String USER = "dba_user";
    private static final String PASSWORD = "191448057devops";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
        }
        return connection;
    }
}
