package com.jdbc.basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyajava";
        String userName = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {

            String sql = "create table employee(name varchar(20),employeeId int primary key,city varchar(20))";
            boolean result = statement.execute(sql);
            System.out.println("Table Created" + result);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}