package com.jdbc.basics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyajava";
        String userName = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {

            String sql = "insert into employee values('manjunath'',1,'Banglore')";
            boolean result = statement.execute(sql);
            System.out.println("Data inserted" + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
