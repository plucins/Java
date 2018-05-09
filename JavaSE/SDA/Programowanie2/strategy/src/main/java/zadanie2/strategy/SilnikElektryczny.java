package zadanie2.strategy;

import zadanie2.INaped;

public class SilnikElektryczny implements INaped {

    public double getPoborPraduSilnika() {
        return 1.0;
    }

    public double getPoborPaliwaSilnika() {
        return 0;
    }

    public double getMocSilnika() {
        return 0.5;
    }
}
