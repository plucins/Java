package obiekty;

public class MainPunkt {

    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        Punkt p1 = new Punkt(2,5);
        Punkt p2 = new Punkt(5,9);

        p1.wyswietl();
        p2.wyswietl();

        System.out.println("Odleglosc miedzy punktami to " +punkt.obliczOdleglosc(p1,p2));

    }
}
