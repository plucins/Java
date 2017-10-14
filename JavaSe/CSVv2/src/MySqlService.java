import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlService {

    private Connection connection;
    private String url = "";

    private PreparedStatement addRecord;

    public void establishDBConnection(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            connection = DriverManager.getConnection(url,"user","pass");


        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addLeadToDB(Lead lead){
        try{
            addRecord = connection.
                    prepareStatement("INSERT INTO csv(calculationNumber,ug,telNumber,calculationLink,clausules) VALUES(?,?,?,?,?)");

            addRecord.setString(1,lead.getCalculationNumber());
            addRecord.setString(2,lead.getUg());
            addRecord.setString(3,lead.getTelNumber());
            addRecord.setString(4,lead.getCalculationLink());
            addRecord.setString(5,lead.getClausules());

            addRecord.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
