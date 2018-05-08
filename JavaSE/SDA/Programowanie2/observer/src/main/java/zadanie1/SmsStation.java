package zadanie1;

import java.util.Observable;

public class SmsStation extends Observable {

    public void addPhone(Phone p){
        addObserver(p);
    }

    public void sendSms(String nrDoKogo, String tresc){
        setChanged();
        notifyObservers(new Message(nrDoKogo,tresc));
    }
}
