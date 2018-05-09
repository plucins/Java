package zadanie2.strategy;

import zadanie2.INaped;

public class SilnikHybrydowy implements INaped {

    public double getPoborPraduSilnika() {
        return 0.5;
    }

    public double getPoborPaliwaSilnika() {
        return 0.5;
    }

    public double getMocSilnika() {
        return 0.75;
    }
}
