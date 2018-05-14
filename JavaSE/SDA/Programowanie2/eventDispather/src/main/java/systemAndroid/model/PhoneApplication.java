package systemAndroid.model;

import systemAndroid.zdarzenia.ICallListener;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PhoneApplication extends AbstractRegistrable implements ICallListener {
    private Map<Integer, Call> startedCalls = new HashMap<>();

    public PhoneApplication() {}

    @Override
    public void callStaarted(Call call) {
        if (!startedCalls.containsKey(call.getCallID())) {
            call.setRozpoczecieRozmowy(LocalDateTime.now());
            startedCalls.put(call.getCallID(), call);
            System.out.println("telefon rozpoczyna " + call.getKierunekRozmowy() + " rozmowe o ID " + call.getCallID());
        } else {
            System.out.println("Polaczenie już trwa");
        }
    }

    @Override
    public void callEnded(Call call) {
        if (startedCalls.containsKey(call.getCallID())) {
            call.setZakonczenieRozmowy(LocalDateTime.now());
            startedCalls.remove(call.getCallID());
            System.out.println("telefon konczy rozmowe o ID " + call.getCallID());
        }else {
            System.out.println("Połączenie nie został rozpoczęte");
        }
    }
}
