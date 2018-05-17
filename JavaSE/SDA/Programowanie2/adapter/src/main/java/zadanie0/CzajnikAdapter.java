package zadanie0;

public class CzajnikAdapter implements ISwitchable {
    private Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }


    public void switch_on() {
        czajnik.wlacz();
    }

    public void switch_off() {
        czajnik.wylacz();
    }
}
