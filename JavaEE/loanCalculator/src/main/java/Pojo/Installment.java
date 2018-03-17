package Pojo;

public class Installment {
    private int number;
    private double capital;
    private double interest;
    private double fixedFees;
    private double totalAmount;

    public Installment(int number, double capital, double fixedFees, double totalAmount) {
        this.number = number;
        this.capital = capital;
        this.interest = Math.round((totalAmount - capital)*100d)/100d;
        this.fixedFees = fixedFees;
        this.totalAmount = totalAmount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getFixedFees() {
        return fixedFees;
    }

    public void setFixedFees(double fixedFees) {
        this.fixedFees = fixedFees;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Installment{" +
                "number=" + number +
                ", capital=" + capital +
                ", interest=" + interest +
                ", fixedFees=" + fixedFees +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
