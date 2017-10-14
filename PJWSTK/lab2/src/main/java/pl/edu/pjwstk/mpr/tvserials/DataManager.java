package pl.edu.pjwstk.mpr.tvserials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class DataManager {

    private Connection connection;
    private String url = "jdbc:hsqldb:hsql://localhost/";

    private PreparedStatement addPerson;
    private PreparedStatement deletaAllPersons;
    private PreparedStatement getAllPersons;
    private Statement statement;






}
