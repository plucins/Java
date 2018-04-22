package model;

import java.util.Date;

public class LoanApplication {
    private Person person;
    private Adress adress;
    private LoanParameters parameters;
    private String number;
    private Date date;
    private String step;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public LoanParameters getParameters() {
        return parameters;
    }

    public void setParameters(LoanParameters parameters) {
        this.parameters = parameters;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
