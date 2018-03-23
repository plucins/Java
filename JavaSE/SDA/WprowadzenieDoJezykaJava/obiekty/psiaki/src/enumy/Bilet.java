package enumy;

public enum Bilet {
    ULGOWY_GODZINNY(1.6,60),
    ULGOWY_CALODNIOWY(5.2,1440),
    NORMALNY_GODZINNY(3.2,60),
    NORMALNY_CALODNIOWY(10.4,1440),
    BRAK_BILETU(0,0);



    private double cena;
    private int czasJazdy;

    Bilet(double cena,int czasJazdy) {
        this.cena = cena;
        this.czasJazdy = czasJazdy;
    }

    public double getCena() {
        return this.cena;
    }

    public int getCzasJazdy(){
        return this.czasJazdy;
    }

    public void wyswietlDaneOBilecie(){
        String nazwa = "" +this +  " " + this.getCzasJazdy()/60 + "h " + this.getCena() + "zł";
        System.out.println(nazwa.toLowerCase().replace("_"," "));
    }


}
