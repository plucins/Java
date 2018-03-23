package Zadanie2;

import java.util.Random;

public class Telefon implements Dzwoni {
    private String numerTelefonu;
    private int lacznyCzasRozmowy;

    @Override
    public void zadzwon(String s1) {
        Random random = new Random();
        if(random.nextInt(10) > 4){
            System.out.println("dodzwonilem sie");
        }else {
            System.out.println("nie dodzwonilem sie");
        }
    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        System.out.println("Dzwonie na " + nrAlarmowy);
    }
}
