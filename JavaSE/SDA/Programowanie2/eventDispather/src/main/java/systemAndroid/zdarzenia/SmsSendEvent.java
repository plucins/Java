package systemAndroid.zdarzenia;

import systemAndroid.EventDispatcher;
import systemAndroid.model.Call;

import java.util.List;

public class SmsSendEvent implements IEvent {
    private String text;
    private String number;

    public SmsSendEvent(String text, String number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public void execute() {
        List<ISmsListener> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(ISmsListener.class);

        for(ISmsListener p: powitanie){
            p.sendSms(text,number);
        }
    }
}
