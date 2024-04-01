package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "insert into cab values(?,?,?,?,?,?)";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            Scanner scanner = new Scanner((System.in));
            for (int i = 0;i < 5;i++){
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickup = scanner.next();
                String driverName = scanner.next();
                String date = scanner.next();
                String timestamp = scanner.next();

                preparedStatement.setInt(1, cabNumber);
                preparedStatement.setString(2, drop);
                preparedStatement.setString(3, pickup);
                preparedStatement.setTime(4, Time.valueOf(timestamp));
                preparedStatement.setDate(5,Date.valueOf(date) );
                boolean result = preparedStatement.execute(sql);
                System.out.println("Data inserted" + result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}