package smsStation;

public class Main {
    public static void main(String[] args) {
        SmsStation s = new SmsStation();
        s.addClient(new Phone("54321"));
        s.addClient(new Phone("123"));
        s.addClient(new Phone("54444444421"));

        s.sendSms("123","moja tresc");
    }
}
