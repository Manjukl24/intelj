package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "update cab set driver_name=? where cab_number=?";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner((System.in));) {

            String drivername = scanner.next();
            int cabNumber = scanner.nextInt();

            preparedStatement.setString(1, drivername);
            preparedStatement.setInt(2, cabNumber);
            boolean result = preparedStatement.execute(sql);
            System.out.println("Data inserted" + result);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}