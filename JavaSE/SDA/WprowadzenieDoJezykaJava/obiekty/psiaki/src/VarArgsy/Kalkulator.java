package VarArgsy;

public class Kalkulator {

    private int dodaj(int... i) {
        int suma = 0;
        for (int a : i) {
            suma += a;
        }

        return suma;
    }

    private int odejmij(int... i) {
        int suma = 0;
        for (int a : i) {
            suma += a;
        }

        return suma;
    }


    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        for (int i = 0; i < args.length; i++) {
            System.out.println("Wynik dodawania podanych argumentow " + kalkulator.dodaj(Integer.parseInt(args[i])));
            System.out.println("Wynik odejmowania podanych argumentow " + kalkulator.odejmij(Integer.parseInt(args[i])));
        }
    }
}