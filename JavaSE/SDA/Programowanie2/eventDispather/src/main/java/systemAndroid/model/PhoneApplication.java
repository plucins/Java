package systemAndroid.model;

import systemAndroid.zdarzenia.ICallListener;

public class PhoneApplication extends AbstractRegistrable implements ICallListener {

    public PhoneApplication() {
    }

    @Override
    public void callStaarted(int call_id) {
        System.out.println("telefon rozpoczyna rozmowe o ID " + call_id);
    }

    @Override
    public void callEnded(int call_id) {
        System.out.println("telefon konczy rozmowe o ID " + call_id);
    }
}
