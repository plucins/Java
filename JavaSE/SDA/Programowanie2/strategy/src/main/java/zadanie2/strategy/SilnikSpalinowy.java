package zadanie2.strategy;

import zadanie2.INaped;

public class SilnikSpalinowy implements INaped {


    public double getPoborPraduSilnika() {
        return -1.0;
    }

    public double getPoborPaliwaSilnika() {
        return 1.0;
    }

    public double getMocSilnika() {
        return 1.0;
    }
}
