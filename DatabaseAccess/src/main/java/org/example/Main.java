package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UNC_DatabaseAccess", "postgres", "postgres");
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);


        statement.executeUpdate("update table1 set value = 10 where id = 1" );
        statement.executeUpdate("update table1 set value = 10 where id = 2" );
        int updatedValues = statement.executeUpdate("update table1 set value = 10 where id = 2" );

        if(updatedValues == 0){
            System.out.println("Rollback");
            connection.rollback();
        } else {
            System.out.println("Commit");
            connection.commit();
        }
        ResultSet resultSet = statement.executeQuery("select 1 tmp");
        resultSet.next();
        System.out.println(resultSet.getInt("tmp"));
    }
}
