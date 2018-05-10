package smsStation;

import java.util.LinkedList;
import java.util.List;

public class Phone {
    private List<Message> inbox = new LinkedList<>();
    private String numerTelefonu;

    public Phone(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void dodajWiadomosc(Message m){
        if(!m.getNadawca().equals(numerTelefonu)) {
            inbox.add(m);
        }
    }
}
