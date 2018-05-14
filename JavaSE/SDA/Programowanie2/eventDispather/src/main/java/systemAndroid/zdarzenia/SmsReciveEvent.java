package systemAndroid.zdarzenia;

import systemAndroid.EventDispatcher;

import java.util.List;

public class SmsReciveEvent implements IEvent {
    private String text;
    private String number;

    public SmsReciveEvent(String text, String number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public void execute() {
        List<ISmsListener> smsrecives = EventDispatcher.getInstance()
                .pobierzObiektyImplementujaceInterface(ISmsListener.class);

        for(ISmsListener s: smsrecives){
            s.reciveSms(text,number);
        }

    }

}
