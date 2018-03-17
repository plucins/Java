package Controller;

import Pojo.Calculation;
import Pojo.Installment;

import java.util.ArrayList;
import java.util.List;

public class CalculationController {

    public List<Installment> pobierzHarmonogram(Calculation c) {
        if (c.getInstallmentsType().equals("constans")) {
            return pobierzHarmonogramRownychRat(c);
        }
        return pobierzHarmonogramRatMalejacych(c);
    }


    private List<Installment> pobierzHarmonogramRatMalejacych(Calculation c) {
        List<Installment> harmonogramRat = new ArrayList<>();
        for (int i = 1; i <= liczbaRat(c); i++) {
            harmonogramRat.add(new Installment(i, jednaRataBezOprocentowania(c), pojedynczyKosztStaly(c), jednaRataMalejaca(c, i)));
        }
        return harmonogramRat;

    }

    private List<Installment> pobierzHarmonogramRownychRat(Calculation c) {
        List<Installment> harmonogramRat = new ArrayList<>();
        for (int i = 1; i <= liczbaRat(c); i++) {
            harmonogramRat.add(new Installment(i, jednaRataBezOprocentowania(c), pojedynczyKosztStaly(c), jednaRataRowna(c)));
        }
        return harmonogramRat;
    }

    private double jednaRataMalejaca(Calculation c, int rata) {
        return Math.round(wysokoscKredytu(c) * (1 + ((liczbaRat(c) - rata) + 1) * stopaDostosowana(c)) / liczbaRat(c) * 100d) / 100d;
    }

    private double jednaRataRowna(Calculation c) {
        return Math.round(wysokoscKredytu(c) * stopaDostosowana(c) * Math.pow((stopaDostosowana(c) + 1), liczbaRat(c)) /
                ((Math.pow(stopaDostosowana(c) + 1, liczbaRat(c))) - 1) * 100d) / 100d;
    }

    private double pojedynczyKosztStaly(Calculation c) {
        return Math.round(kosztStaly(c) / liczbaRat(c) * 100d) / 100d;
    }

    private double jednaRataBezOprocentowania(Calculation c) {
        return Math.round(wysokoscKredytu(c) / liczbaRat(c) * 100d) / 100d;
    }

    private double wysokoscKredytu(Calculation c) {
        return Double.parseDouble(c.getLoanValue());
    }

    private double liczbaRat(Calculation c) {
        return Double.parseDouble(c.getNumberOfInstallments());
    }

    private double oprocentowanie(Calculation c) {
        return Double.parseDouble(c.getInterest());
    }

    private double stopaDostosowana(Calculation c) {
        return (oprocentowanie(c) * 0.01) / liczbaRat(c);
    }

    private double kosztStaly(Calculation c) {
        return Double.parseDouble(c.getFixedFees());
    }
}
