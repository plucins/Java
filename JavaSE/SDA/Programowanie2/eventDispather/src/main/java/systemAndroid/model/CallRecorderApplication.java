package systemAndroid.model;

import systemAndroid.zdarzenia.ICallListener;

public class CallRecorderApplication extends AbstractRegistrable implements ICallListener {

    public CallRecorderApplication() {
    }

    @Override
    public void callStaarted(Call call) {
        System.out.println("Ropoczeto połączenie o ID " + call.getCallID() + " - nagrywam");
    }

    @Override
    public void callEnded(Call call) {
        System.out.println("Koniec połączenia o ID " + call.getCallID() + " - koniec nagrywania");
    }
}
