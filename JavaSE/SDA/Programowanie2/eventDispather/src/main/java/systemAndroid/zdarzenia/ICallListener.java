package systemAndroid.zdarzenia;

import systemAndroid.model.Call;

public interface ICallListener {
    void callStaarted(Call c);
    void callEnded(Call c);
}
