package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UNC_DatabaseAccess", "postgres", "postgres");
        ResultSet resultSet = connection.createStatement().executeQuery("select 1");
        resultSet.next();
        System.out.println(resultSet.getInt(1));
    }
}
