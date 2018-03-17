package Pojo;

import java.util.List;

public class Calculation {
    private String loanValue;
    private String numberOfInstallments;
    private String interest;
    private String fixedFees;
    private String installmentsType;
    private List<Installment> installmentList;

    public Calculation() {
    }

    public Calculation(String loanValue, String numberOfInstallments, String interest, String fixedFees, String installmentsType, List<Installment> installmentList) {
        this.loanValue = loanValue;
        this.numberOfInstallments = numberOfInstallments;
        this.interest = interest;
        this.fixedFees = fixedFees;
        this.installmentsType = installmentsType;
        this.installmentList = installmentList;
    }

    public String getLoanValue() {
        return loanValue;
    }

    public void setLoanValue(String loanValue) {
        this.loanValue = loanValue;
    }

    public String getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(String numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getFixedFees() {
        return fixedFees;
    }

    public void setFixedFees(String fixedFees) {
        this.fixedFees = fixedFees;
    }

    public String getInstallmentsType() {
        return installmentsType;
    }

    public void setInstallmentsType(String installmentsType) {
        this.installmentsType = installmentsType;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void setInstallmentList(List<Installment> installmentList) {
        this.installmentList = installmentList;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "loanValue=" + loanValue +
                ", numberOfInstallments='" + numberOfInstallments + '\'' +
                ", interest='" + interest + '\'' +
                ", fixedFees=" + fixedFees +
                ", installmentsType='" + installmentsType + '\'' +
                ", installmentList=" + installmentList +
                '}';
    }
}
