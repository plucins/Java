package systemAndroid.zdarzenia;

public interface ISmsListener {
    void sendSms(String text, String number);
    void reciveSms(String text, String number);
}
