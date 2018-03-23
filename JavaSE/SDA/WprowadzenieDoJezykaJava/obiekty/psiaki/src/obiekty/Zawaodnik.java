package obiekty;

import java.util.Random;

public class Zawaodnik {
    int id;
    String imie;
    double predkoscMin;
    double predkoscMax;
    double pokonanaOdleglosc = 0;

    public Zawaodnik(int id, String imie, double predkoscMin, double predkoscMax) {
        this.id = id;
        this.imie = imie;
        this.predkoscMin = predkoscMin;
        this.predkoscMax = predkoscMax;
    }

    public Zawaodnik() {}

    public void przedstawSie(Zawaodnik zawaodnik){
        System.out.println("#" + zawaodnik.id + " nazywam sie " + zawaodnik.imie + " biegam z predkoscia od " + zawaodnik.predkoscMin + "km/h" +
                " do" +zawaodnik.predkoscMax + "km/h");
    }

    public void biegnij(){
        Random random = new Random();
        this.pokonanaOdleglosc += this.predkoscMin + (this.predkoscMax - this.predkoscMin) * random.nextDouble();
        System.out.println(this.imie + " przebiegl " + String.format("%.2f",this.pokonanaOdleglosc));
    }

    public static void main(String[] args) {
        Zawaodnik adam = new Zawaodnik(3,"Adam",4.7,9.9);
        Zawaodnik mariusz = new Zawaodnik(1,"Mariusz",6.6,13.2);
        Zawaodnik pawel = new Zawaodnik(2,"Pawel",5.6,7.9);

        Zawaodnik[] zawaodnicy = new Zawaodnik[]{adam,mariusz,pawel};

        for(Zawaodnik z: zawaodnicy){
            new Zawaodnik().przedstawSie(z);
        }


        while(true){
            for(Zawaodnik z :zawaodnicy) {
                z.biegnij();
                if (!(z.pokonanaOdleglosc < 50)) {
                    System.out.println("Zawornik z numerem " + z.id + " imieniem "  + z.imie + " wygral");
                    return;
                }
            }
        }


    }
}
