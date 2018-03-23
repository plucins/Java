package obiekty;

public class Punkt {
    int x;
    int y;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Punkt() {}

    public void wyswietl(){
        System.out.println("x - "+ this.x + " y - " + this.y);
    }

    public double obliczOdleglosc(Punkt p1, Punkt p2){
        return Math.sqrt(Math.pow(p2.x - p1.x,2) + Math.pow(p2.y - p1.y,2));

    }
}
