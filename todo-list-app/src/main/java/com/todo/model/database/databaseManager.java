package com.todo.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseManager {
    private static final String URL = "jdbc:sqlite:todo.db"; // Nom du fichier SQLite (a mettre a la maison )

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("✅ Connexion à SQLite réussie !");
        } catch (SQLException e) {
            System.out.println("❌ Erreur de connexion à SQLite : " + e.getMessage());
        }
        return conn;
    }
}
