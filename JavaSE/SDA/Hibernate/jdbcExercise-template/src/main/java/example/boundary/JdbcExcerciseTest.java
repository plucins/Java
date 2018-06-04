package example.boundary;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExcerciseTest {

    public void getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("");
    }
}
