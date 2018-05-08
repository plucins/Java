package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    private String phoneNumber;
    private List<String> inbox = new ArrayList<>();

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Message);
        Message wiadomosc = (Message) arg;
        if(wiadomosc.getDoKogo().equals(phoneNumber)){
            inbox.add(wiadomosc.getTresc());
            System.out.println("Dostałem wiadomosc " + wiadomosc.getDoKogo());
        }
    }
}
