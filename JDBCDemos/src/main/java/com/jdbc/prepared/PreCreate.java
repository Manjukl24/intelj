package com.jdbc.prepared;

import java.sql.*;

public class PreCreate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username ="root";
        String password="root";
        String sql ="create table cab(cab_nyumber int primary key,"+
              "drop varchar(20),"+
                "pickup_time timestamp,"+
                "pickup_date date,"+
                "driver_name varchar(20),";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) { boolean result = preparedStatement.execute(sql);
            System.out.println("Table Created" + result);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        }
        }