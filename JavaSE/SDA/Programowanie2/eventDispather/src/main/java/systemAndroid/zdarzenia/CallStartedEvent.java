package systemAndroid.zdarzenia;

import systemAndroid.EventDispatcher;

import java.util.List;

public class CallStartedEvent implements IEvent {
    private int call_id;

    public CallStartedEvent(int call_id) {
        this.call_id = call_id;
    }

    @Override
    public void execute() {
        List<ICallListener> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(ICallListener.class);

        for(ICallListener p: powitanie){
            p.callStaarted(call_id);
        }
    }
}
