package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/dbmysql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "zombik05aha-1";

    private static final Connection connection = null;

     public static Connection getConnection() {
         Connection connection = null;
         try {
             connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
         return connection;
     }
}
