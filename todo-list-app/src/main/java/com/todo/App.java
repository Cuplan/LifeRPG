package com.todo;
  import java.sql.Connection;
import com.todo.model.database.databaseManager;

public class App {

    public class Main {

        public static void main(String[] args) {
            Connection conn = databaseManager.getConnection();
            if (conn != null) {
                System.out.println("🎉 Connexion établie !");
            } else {
                System.out.println("⚠ Impossible de se connecter à la base de données.");
            }
        }
        }
        
}
