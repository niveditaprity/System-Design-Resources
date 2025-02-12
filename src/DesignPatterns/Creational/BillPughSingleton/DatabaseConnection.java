package DesignPatterns.Creational.BillPughSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private Connection connection;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "password";

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connection Established!");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    // **Bill Pugh Singleton: Inner Static Helper Class**
    private static class SingletonHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

    // Method to close the connection
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database Connection Closed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
