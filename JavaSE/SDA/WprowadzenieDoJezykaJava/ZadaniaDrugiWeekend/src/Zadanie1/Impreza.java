package Zadanie1;

import java.util.Random;

public class Impreza {
    GatunekPiwa[] gatunkiPiwa = new GatunekPiwa[2];

    Impreza() {
        for (int i = 0; i < 2; i++) {
            gatunkiPiwa[i] = GatunekPiwa.values()[new Random().nextInt(GatunekPiwa.values().length)];
        }
    }

    public static void main(String[] args) {
        Impreza impreza = new Impreza();

        System.out.println("Dostępne Piwa to: ");
        for (GatunekPiwa g : impreza.gatunkiPiwa) {
            g.opisPiwa();
        }
    }
}
