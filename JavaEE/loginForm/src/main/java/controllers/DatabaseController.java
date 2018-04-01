package controllers;

import model.UserToReg;

import java.sql.*;

public class DatabaseController {

    String url = "jdbc:hsqldb:hsql://localhost/";
    String username = "SA";
    String password = "";

    Connection connection;

    public DatabaseController() {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addToDataBase(UserToReg u) {
        String query = "INSERT INTO USERS (LOGIN,PASSWORD,EMAIL,RIGHTS) VALUES (?,?,?,?)";
        try {
            PreparedStatement insertRecord = connection.prepareStatement(query);
            insertRecord.setString(1, u.getLogin());
            insertRecord.setString(2, u.getPassword());
            insertRecord.setString(3, u.getEmail());
            insertRecord.setString(4, u.getRights());
            insertRecord.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ResultSet selectLoginFromDatabase(String login) {
        ResultSet rs = null;
        String query = "SELECT LOGIN,PASSWORD FROM USERS WHERE LOGIN = (?)";

        try {
            PreparedStatement select = connection.prepareStatement(query);
            select.setString(1, login);
            rs = select.executeQuery();

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public boolean isUserCorrectAuth(String login, String password) {
        ResultSet rs = selectLoginFromDatabase(login);
        boolean isCorrect = false;

        try {
            rs.next();
            isCorrect = rs.getString("LOGIN").equals(login) & rs.getString("PASSWORD").equals(password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isCorrect;
    }


}
