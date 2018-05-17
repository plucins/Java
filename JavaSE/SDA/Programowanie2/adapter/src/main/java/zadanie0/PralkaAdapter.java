package zadanie0;

public class PralkaAdapter extends Pralka implements ISwitchable {
    public void switch_on() {
        super.turnOn();
    }

    public void switch_off() {
        super.turnOff();
    }
}
