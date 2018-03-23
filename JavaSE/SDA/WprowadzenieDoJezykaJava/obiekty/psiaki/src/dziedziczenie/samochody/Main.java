package dziedziczenie.samochody;

public class Main {
    public static void main(String[] args) {
        Kabriolet kabriolet = new Kabriolet("czerwony",Marka.BMW,2012,false);
        Samochod nieKabriolet = new Samochod("czerwony",Marka.BMW,2012);

        int predkoscMax = 120;

        while(nieKabriolet.getPredkosc() != predkoscMax){
            nieKabriolet.przyspiesz(predkoscMax);
        }

        System.out.println(kabriolet);
        System.out.println(nieKabriolet);

        System.out.println(kabriolet.equals(nieKabriolet));

    }
}
