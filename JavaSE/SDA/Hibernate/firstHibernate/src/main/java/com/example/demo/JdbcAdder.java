package com.example.demo;

import java.sql.*;

public class JdbcAdder {

    Connection connection;

    {
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/softwareacademy","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person p){
        try {
            PreparedStatement addPerson = connection.prepareStatement("INSERT INTO Persons (name, lastname) VALUE (?,?)");
            addPerson.setString(1,p.getName());
            addPerson.setString(2,p.getLastName());
            addPerson.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
