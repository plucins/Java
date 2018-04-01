package controllers;

import model.User;

import java.sql.*;

public class DatabaseController {

    private static final String url = "jdbc:hsqldb:hsql://localhost/";
    private static final String username = "SA";
    private static final String password = "";

    private Connection connection;

    public DatabaseController() {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean addToDataBase(User u) {
        String query = "INSERT INTO USERS (LOGIN,PASSWORD,EMAIL,RIGHTS) VALUES (?,?,?,?)";

        if (isUserExistInDatabase(u.getLogin())) {
            return false;
        } else {

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
        return true;
    }

    private ResultSet selectUserFromDatabase(String login) {
        ResultSet rs = null;
        String query = "SELECT * FROM USERS WHERE LOGIN = (?)";

        try {
            PreparedStatement select = connection.prepareStatement(query);
            select.setString(1, login);
            rs = select.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    private boolean isUserExistInDatabase(String login) {
        String query = "SELECT LOGIN FROM USERS WHERE LOGIN = (?)";
        boolean isUnique = true;
        try {
            PreparedStatement select = connection.prepareStatement(query);
            select.setString(1, login);

            ResultSet rs = select.executeQuery();
            rs.next();
            isUnique = rs.isBeforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUnique;
    }

    public boolean isUserCorrectAuth(String login, String password) {
        ResultSet rs = selectUserFromDatabase(login);
        boolean isCorrect = false;

        try {
            rs.next();
            isCorrect = rs.getString("LOGIN").equals(login) & rs.getString("PASSWORD").equals(password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isCorrect;
    }

    public User getUserByName(String login) {
        ResultSet rs = selectUserFromDatabase(login);

        User u = new User();
        try {
            rs.next();
            u.setLogin(rs.getString("LOGIN"));
            u.setEmail(rs.getString("EMAIL"));
            u.setRights(rs.getString("RIGHTS"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;

    }
}
