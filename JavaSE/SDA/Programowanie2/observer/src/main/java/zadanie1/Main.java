package zadanie1;

public class Main {
    public static void main(String[] args) {


        SmsStation s = new SmsStation();
        s.addPhone(new Phone("112"));
        s.addPhone(new Phone("512"));
        s.addPhone(new Phone("912"));

        s.sendSms("512","Tresc");
    }
}
