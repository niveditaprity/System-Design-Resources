package DesignPatterns.Creational.Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbInstance = DatabaseConnection.getInstance();
        Connection connection = dbInstance.getConnection();

        try {
            String sql = "SELECT * FROM employees"; // Replace with your table name
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Employee Name: " + resultSet.getString("name"));
            }

            // Close resources
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
