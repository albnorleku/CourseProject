package com.roiacademy.h2Database;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionH2Demo {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/courseDemo";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            /*String sql =  "CREATE TABLE   COURSE_USERS " +
                    "(id INTEGER auto_increment not NULL, " +
                    " first_name VARCHAR(255), " +
                    " last_name VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";*/

            String sql = "INSERT INTO course_users (first_name, last_name, age) VALUES ('Test3', 'test_last3', '65')";

            //String sql = "ALTER TABLE course_users ALTER COLUMN id INT auto_increment";
            statement.execute(sql);
            System.out.println("Creating table Course_Users...");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
