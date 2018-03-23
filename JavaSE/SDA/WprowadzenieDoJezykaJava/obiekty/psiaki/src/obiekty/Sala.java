package obiekty;

public class Sala {
    String nazwa;
    double m2;
    int iloscStanowisk;
    boolean czyJestRzutnik;
    boolean czyJestWolny;

    public Sala(String nazwa, double m2, int iloscStanowisk, boolean czyJestRzutnik) {
        this.nazwa = nazwa;
        this.m2 = m2;
        this.iloscStanowisk = iloscStanowisk;
        this.czyJestRzutnik = czyJestRzutnik;
    }

    public void wyswietlOpisSali(){
        if(czyJestRzutnik){
            System.out.println(String.format("obiekty.Sala %s o pow. %.2f z %d biurkami i dostepnym rzutnikiem",
                    nazwa, m2,iloscStanowisk));
        }else {
            System.out.println(String.format("obiekty.Sala %s o pow. %.2f z %d biurkami",
                    nazwa, m2,iloscStanowisk));
        }
    }
}
