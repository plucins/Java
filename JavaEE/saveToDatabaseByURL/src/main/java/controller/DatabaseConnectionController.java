package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionController {

    public Connection establishConnection(){
        Connection connection = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");

            String url = "jdbc:hsqldb:hsql://localhost/";
            String userName = "SA";
            String password = "";

            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
