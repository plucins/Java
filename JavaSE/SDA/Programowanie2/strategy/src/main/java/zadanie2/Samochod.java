package zadanie2;

public class Samochod {
    private String nrRejestracyny;
    private INaped silnik;
    private double predkosc;
    private double iloscPaliwa;
    private double poziomNaladowaniaAkumulatora;

    public Samochod(String nrRejestracyny) {
        this.nrRejestracyny = nrRejestracyny;
    }

    public void setSilnik(INaped silnik) {
        this.silnik = silnik;
    }

    public void przyspiesz(){
        this.predkosc += 20;
        iloscPaliwa -= silnik.getPoborPaliwaSilnika();
    }

    public void zwolnij(){
        this.predkosc -= 20;
        this.poziomNaladowaniaAkumulatora += silnik.getPoborPraduSilnika();
    }
}
