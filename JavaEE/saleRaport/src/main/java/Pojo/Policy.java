package Pojo;

import java.util.Date;

public class Policy{

    private int id;
    private String brand;
    private String policyNumber;
    private String callerPhoneNumber;
    private String policyValue;
    private String sourceIncome;
    private String extraInfo;
    private String agencyClient;
    private String agentName;
    private String agentLastName;
    private String agentDomainLogin;
    private Date policyCalculationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public String getAgentDomainLogin() {
        return agentDomainLogin;
    }

    public void setAgentDomainLogin(String agentDomainLogin) {
        this.agentDomainLogin = agentDomainLogin;
    }

    public String getCallerPhoneNumber() {
        return callerPhoneNumber;
    }

    public void setCallerPhoneNumber(String callerPhoneNumber) {
        this.callerPhoneNumber = callerPhoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(String policyValue) {
        this.policyValue = policyValue;
    }

    public String getSourceIncome() {
        return sourceIncome;
    }

    public void setSourceIncome(String sourceIncome) {
        this.sourceIncome = sourceIncome;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getAgencyClient() {
        return agencyClient;
    }

    public void setAgencyClient(String agencyClient) {
        this.agencyClient = agencyClient;
    }

    public Date getPolicyCalculationDate() {
        return policyCalculationDate;
    }

    public void setPolicyCalculationDate(Date policyCalculationDate) {
        this.policyCalculationDate = policyCalculationDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "brand='" + brand + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", callerPhoneNumber='" + callerPhoneNumber + '\'' +
                ", policyValue='" + policyValue + '\'' +
                ", sourceIncome='" + sourceIncome + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                ", agencyClient='" + agencyClient + '\'' +
                '}';
    }
}
