package systemAndroid.zdarzenia;

import systemAndroid.EventDispatcher;
import systemAndroid.model.Call;

import java.util.List;

public class OutgoingCallEvent implements IEvent {
    private int call_id;
    private String numberToCall;

    public OutgoingCallEvent(int call_id) {
        this.call_id = call_id;
    }

    @Override
    public void execute() {
        List<ICallListener> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(ICallListener.class);

        for(ICallListener p: powitanie){
            p.callStaarted(new Call(call_id,"wychodzacy"));
        }
    }
}
