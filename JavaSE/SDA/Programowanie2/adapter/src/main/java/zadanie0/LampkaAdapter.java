package zadanie0;

public class LampkaAdapter implements ISwitchable{
    private Lampka lampka;

    public LampkaAdapter(Lampka lampka) {
        this.lampka = lampka;
    }

    public void switch_on() {
        lampka.switchOn();
    }

    public void switch_off() {
        lampka.switchOff();
    }
}
