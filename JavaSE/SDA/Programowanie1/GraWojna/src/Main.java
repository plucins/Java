public class Main {
    public static void main(String[] args) {
        Karta k = new Karta();
        Stol s = new Stol();


        Gracz g = new Gracz("Adam");
        Gracz g1 = new Gracz("Alek");

        s.addGamer(g);
        s.addGamer(g1);
        s.shereOut();
        s.getOneCardFromPlayer();
        System.out.println(s.checkWinenr());
    }
}
