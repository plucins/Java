import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    Connection connection;
    String url = "";
    String user = "";
    String password = "";

    public DBConnector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
