package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalTime;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        "drop varchar(20)," +
                "pickup_time timestamp," +
                String sql = "create table cab(cab_nyumber int primary key," +
      "pickup_date date," +
                "driver_name varchar(20),";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.excuteQuery(sql)
        ) {
            while (resultSet.next()){
                int cabNumber = resultSet.getInt("cab_number");
                String drop_location = resultSet.getString("droplocation");
                String pickup = resultSet.getString("pickup");
                Time time = resultSet.getTime("time");
                LocalTime localTime=LocalTime.parse(time.toString());
                String pickup_update = resultSet.getString("pickupupdate");
                String driver_name = resultSet.getString("drivername");
                System.out.println(cabNumber+" ");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}