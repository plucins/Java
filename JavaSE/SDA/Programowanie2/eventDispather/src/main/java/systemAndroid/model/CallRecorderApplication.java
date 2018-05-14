package systemAndroid.model;

import systemAndroid.zdarzenia.ICallListener;

public class CallRecorderApplication extends AbstractRegistrable implements ICallListener {

    public CallRecorderApplication() {
    }

    @Override
    public void callStaarted(int call_id) {
        System.out.println("Ropoczeto połączenie o ID " + call_id + " - nagrywam");
    }

    @Override
    public void callEnded(int call_id) {
        System.out.println("Koniec połączenia o ID " +call_id + " - koniec nagrywania");
    }
}
