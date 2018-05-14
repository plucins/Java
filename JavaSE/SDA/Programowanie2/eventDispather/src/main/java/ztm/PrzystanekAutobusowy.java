package ztm;

public class PrzystanekAutobusowy extends AbstractRegistrable implements IPowiadamianyOAutobusie, IPowiadamialnyOSpoznieniu {
    private int numberPrzystanku;

    public PrzystanekAutobusowy(int numberPrzystanku) {
        this.numberPrzystanku = numberPrzystanku;
    }

    public int getNumberPrzystanku() {
        return numberPrzystanku;
    }

    public void setNumberPrzystanku(int numberPrzystanku) {
        this.numberPrzystanku = numberPrzystanku;
    }


    @Override
    public void powiadomOOpoznieniu(Autobusy autobusy) {
        System.out.println("Powiadomienie przystanku o numerze " + this.numberPrzystanku + " o spoznieniu");
    }

    @Override
    public void powiadomOAutobusie(Autobusy o) {
        System.out.println("Powiadamiam o autobusie " + this.numberPrzystanku);
    }
}
