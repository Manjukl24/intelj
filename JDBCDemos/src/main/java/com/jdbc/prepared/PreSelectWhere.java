package com.jdbc.prepared;
import java.sql.*;
import java.time.LocalTime;

public class PreSelectWhere {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.excuteQuery(sql)
        ) {
            while (resultSet.next()) {
                int cabNumber = resultSet.getInt("cab_number");
                String drop_location = resultSet.getString("droplocation");
                String pickup = resultSet.getString("pickup");
                Time time = resultSet.getTime("time");
                LocalTime localTime = LocalTime.parse(time.toString());
                String pickup_update = resultSet.getString("pickupupdate");
                String driver_name = resultSet.getString("driver name");
                System.out.println(cabNumber + "  " + "\t" + drop_location);
            }
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }