package taliaKart;

public class Stol {
    public static void main(String[] args) {
        Karta[] karty = new Karta[52];

        int wydrukowaneKarty = 0;
        for(Figura f: Figura.values()){
            for(Kolor k : Kolor.values()){
                karty[wydrukowaneKarty] = new Karta(f,k);
                wydrukowaneKarty++;
            }
        }

        for(Karta karta:karty){
            System.out.println(karta);
        }


    }
}
