package controllers;

import model.UserToReg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseController {

    String url = "jdbc:hsqldb:hsql://localhost/";
    String username = "SA";
    String password = "";

    Connection connection;

    public DatabaseController(){
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addToDataBase(UserToReg u){
        String query = "INSERT INTO USERS (LOGIN,PASSWORD,EMAIL,RIGHTS) VALUES (?,?,?,?)";
        try {
            PreparedStatement insertRecord = connection.prepareStatement(query);
            insertRecord.setString(1,u.getLogin());
            insertRecord.setString(2,u.getPassword());
            insertRecord.setString(3,u.getEmail());
            insertRecord.setString(4,u.getRights());
            insertRecord.executeUpdate();

            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
