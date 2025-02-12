package DesignPatterns.Creational.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private DatabaseConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user,password);
            System.out.println("Database Connection Established!");
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;

    }
    public Connection getConnection() {
        return connection;
    }
}
