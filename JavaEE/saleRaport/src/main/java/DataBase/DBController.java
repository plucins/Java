package DataBase;

import Pojo.Agent;
import Pojo.Policy;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBController {


    Connection connection;

    private String url = "";
    private String username = "";
    private String password = "";

    public DBController() {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRecord(Policy policy) {
        String query = "INSERT INTO *(brand,policyNumber,callerPhoneNumber,policyValue,sourceIncome,extraInfo,agencyClient, agentName, agentLastName, agentDomainLogin,addedDate ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {


            PreparedStatement insertRecord = connection.prepareStatement(query);
            insertRecord.setString(1, policy.getBrand());
            insertRecord.setString(2, policy.getPolicyNumber());
            insertRecord.setString(3, policy.getCallerPhoneNumber());
            insertRecord.setString(4, policy.getPolicyValue());
            insertRecord.setString(5, policy.getSourceIncome());
            insertRecord.setString(6, policy.getExtraInfo());
            insertRecord.setString(7, policy.getAgencyClient());
            insertRecord.setString(8, policy.getAgentName());
            insertRecord.setString(9,policy.getAgentLastName());
            insertRecord.setString(10,policy.getAgentDomainLogin());
            insertRecord.setDate(11, Date.valueOf(LocalDate.now()));
            insertRecord.executeUpdate();


            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Policy> getPolicies(Agent agent, int dni){
        String query = "SELECT * FROM * WHERE agentDomainLogin = ? and addedDate >= ?";
        List<Policy> polisyPerAgent = new ArrayList<>();

        try {
            PreparedStatement selectStatment = connection.prepareStatement(query);
            selectStatment.setString(1,agent.getDomainLogin());
            selectStatment.setDate(2,Date.valueOf(LocalDate.now().minusDays(dni-1)));
            ResultSet rs = selectStatment.executeQuery();
            while(rs.next()){
               Policy policy = new Policy();
               policy.setBrand(rs.getString("brand"));
               policy.setPolicyNumber(rs.getString("policyNumber"));
               policy.setCallerPhoneNumber(rs.getString("callerPhoneNumber"));
               policy.setPolicyValue(rs.getString("policyValue"));
               policy.setSourceIncome(rs.getString("sourceIncome"));
               polisyPerAgent.add(policy);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return polisyPerAgent;
    }
}
