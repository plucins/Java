package pralka;

public class Main {
    public static void main(String[] args) {
        Pralka pralka = new Pralka();

        pralka.setTrybPracy(new DlugiePranie());

        pralka.startPralka();
    }
}