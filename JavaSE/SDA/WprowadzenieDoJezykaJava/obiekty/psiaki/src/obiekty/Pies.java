package obiekty;

public class Pies {

    String imie;
    int dataUrodzenia;
    String kolor;

    public static void main(String[] args) {
        Pies burek = new Pies();
        burek.imie = "Burek";
        burek.dataUrodzenia = 2015;
        burek.kolor = "Czarny";

        Pies corgi = new Pies();
        corgi.imie = "Mietek";
        corgi.dataUrodzenia = 2017;
        corgi.kolor = "Rudy";

        System.out.println("Mietek");
        corgi.dajGlos(corgi.dataUrodzenia);


        System.out.println("Burek");
        burek.dajGlos(burek.dataUrodzenia);
    }

    private void dajGlos(int wiek) {
        for(int i = 0; i < 2018-wiek; i++) {
            System.out.println("Szczekam");
        }
    }
}
