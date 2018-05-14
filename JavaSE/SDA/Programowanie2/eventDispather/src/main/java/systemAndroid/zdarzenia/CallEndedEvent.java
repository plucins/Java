package systemAndroid.zdarzenia;

import systemAndroid.EventDispatcher;
import systemAndroid.model.Call;

import java.util.List;

public class CallEndedEvent implements IEvent {
    private int call_id;

    public CallEndedEvent(int call_id) {
        this.call_id = call_id;
    }

    @Override
    public void execute() {
        List<ICallListener> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(ICallListener.class);

        for(ICallListener p: powitanie){
            p.callEnded(new Call(call_id,"przychodzacy"));
        }
    }
}
