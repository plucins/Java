package DataBase;

import Pojo.Agent;
import Pojo.Policy;
import org.joda.time.LocalDate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBController {


    Connection connection;




    public DBController() {
        try {
            //Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRecord(Policy policy) {
        String query = "INSERT INTO raportsprzedazy(brand,policyNumber,callerPhoneNumber,policyValue,sourceIncome,extraInfo, agentName, agentLastName, agentDomainLogin,addedDate ) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement insertRecord = connection.prepareStatement(query);
            insertRecord.setString(1, policy.getBrand());
            insertRecord.setString(2, policy.getPolicyNumber());
            insertRecord.setString(3, policy.getCallerPhoneNumber());
            insertRecord.setString(4, policy.getPolicyValue());
            insertRecord.setString(5, policy.getSourceIncome());
            insertRecord.setString(6, policy.getExtraInfo());
            insertRecord.setString(7, policy.getAgentName());
            insertRecord.setString(8,policy.getAgentLastName());
            insertRecord.setString(9,policy.getAgentDomainLogin());
            insertRecord.setDate(10, Date.valueOf(String.valueOf(policy.getPolicyCalculationDate())));
            insertRecord.executeUpdate();


            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Policy> getPolicies(Agent agent, int dni){
        String query = "SELECT * FROM raportsprzedazy WHERE agentDomainLogin = ? and addedDate >= ?";
        List<Policy> polisyPerAgent = new ArrayList<>();

        try {
            if(connection != null) {
                PreparedStatement selectStatment = connection.prepareStatement(query);
                selectStatment.setString(1, agent.getDomainLogin());
                selectStatment.setDate(2, Date.valueOf(String.valueOf(LocalDate.now().minusDays(dni - 1))));
                ResultSet rs = selectStatment.executeQuery();
                while (rs.next()) {
                    Policy policy = new Policy();
                    policy.setId(rs.getInt("id"));
                    policy.setBrand(rs.getString("brand"));
                    policy.setPolicyNumber(rs.getString("policyNumber"));
                    policy.setCallerPhoneNumber(rs.getString("callerPhoneNumber"));
                    policy.setPolicyValue(rs.getString("policyValue"));
                    policy.setSourceIncome(rs.getString("sourceIncome"));
                    polisyPerAgent.add(policy);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return polisyPerAgent;
    }

    public void removePolicie(int id){
        String query = "DELETE FROM raportsprzedazy where id = ?";

        if(connection != null){
            try {
                PreparedStatement removeStatement = connection.prepareStatement(query);
                removeStatement.setInt(1,id);
                removeStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Agent> getAllAgents(){
        List<Agent> agents = new ArrayList<>();
        String query = "SELECT DISTINCT agentName, agentLastName, agentDomainLogin  FROM raportsprzedazy WHERE addedDate >='"+LocalDate.now().minusMonths(2)+"'";

        if(connection != null){
            try {
                PreparedStatement getAllAgents = connection.prepareStatement(query);
                ResultSet rs = getAllAgents.executeQuery();
                while (rs.next()){
                    Agent a = new Agent();
                    a.setName(rs.getString("agentName"));
                    a.setLastName(rs.getString("agentLastName"));
                    a.setDomainLogin(rs.getString("agentDomainLogin"));
                    agents.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return agents;
    }

    public List<Policy> getPoliciesFromPointedDate(String dateFrom, String dateTo, String agentLogin){
        List<Policy> policies = new ArrayList<>();
        String query = "SELECT * FROM raportsprzedazy WHERE agentDomainLogin = ? and addedDate >= ? and addedDate <= ?";

        if(connection != null){
            try {
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1,agentLogin);
                statement.setDate(2,Date.valueOf(dateFrom));
                statement.setDate(3,Date.valueOf(dateTo));
                ResultSet rs = statement.executeQuery();
                getAllPolicies(policies, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return policies;
    }

    public List<Policy> getPoliciesFromPointedDate(String dateFrom, String dateTo){
        List<Policy> policies = new ArrayList<>();
        String query = "SELECT * FROM raportsprzedazy WHERE addedDate >= ? and addedDate <= ?";

        if(connection != null){
            try {
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setDate(1,Date.valueOf(dateFrom));
                statement.setDate(2,Date.valueOf(dateTo));
                ResultSet rs = statement.executeQuery();
                getAllPolicies(policies, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return policies;
    }

    private void getAllPolicies(List<Policy> policies, ResultSet rs) throws SQLException {
        while(rs.next()){
            Policy policy = new Policy();
            policy.setId(rs.getInt("id"));
            policy.setBrand(rs.getString("brand"));
            policy.setPolicyNumber(rs.getString("policyNumber"));
            policy.setCallerPhoneNumber(rs.getString("callerPhoneNumber"));
            policy.setPolicyValue(rs.getString("policyValue"));
            policy.setSourceIncome(rs.getString("sourceIncome"));
            policy.setExtraInfo(rs.getString("extraInfo"));
            policy.setAgentName(rs.getString("agentName"));
            policy.setAgentLastName(rs.getString("agentLastName"));
            policy.setAgentDomainLogin(rs.getString("agentDomainLogin"));
            policy.setPolicyCalculationDate(rs.getDate("addedDate"));
            policies.add(policy);
        }
    }
}
