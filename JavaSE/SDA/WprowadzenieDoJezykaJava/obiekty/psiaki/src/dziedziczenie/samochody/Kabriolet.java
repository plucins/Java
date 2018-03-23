package dziedziczenie.samochody;

public class Kabriolet extends Samochod {

    public Kabriolet(String kolor, Marka marka, int rocznik, boolean czyDachSchowany) {
        super(kolor, marka, rocznik);
        this.czyDachSchowany = czyDachSchowany;
    }

    private boolean czyDachSchowany;

    public void schowajDach(){
        if(czyDachSchowany){
            System.out.println("Dach już schowany");
        }else {
            System.out.println("Chowam dach");
            czyDachSchowany = true;
        }
    }

    @Override
    public int przyspiesz(int predkoscMax) {
        return super.przyspiesz(predkoscMax);
    }

    @Override
    public String toString() {
        return super.toString() + " z rozsuwanym dachem";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Samochod){
            Samochod that = (Samochod) obj;
            if(this.marka == that.marka){
                return true;
            }
        }
        return false;
    }
}
