package abstrakcja;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(1);
        Prostokat prostokat = new Prostokat(1,1);
        Okreg okreg = new Okreg(1);
        Kwadrat kwadrat1 = new Kwadrat(1);

        Figura[] figury = new Figura[]{kwadrat,prostokat,okreg,kwadrat1};

        System.out.println("Do pomalowania wskazanej powierzchni potrzeba " + obliczZapotrzebowanieNaFarbe(figury,3));




    }

    public static int obliczZapotrzebowanieNaFarbe(Figura[] figury, double pojemnikNaFarbe){
        double poleDoZamalowania = 0;
        for(Figura f: figury){
            System.out.println(f.obliczPole());
            poleDoZamalowania += f.obliczPole();
        }
        System.out.println(poleDoZamalowania);

        int ilosc = (int)(poleDoZamalowania/pojemnikNaFarbe);
        if(poleDoZamalowania%pojemnikNaFarbe != 0) {
            ilosc++;
        }

        return ilosc;
    }
}
