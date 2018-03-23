package Zadanie1O;

public class Main {
    public static void main(String[] args) {

        Samochod opel = new Samochod("Czerwony",2010,"Opel");
        SuperSamochod ope1l = new SuperSamochod("Czerwony",2010,"Opel");
        SuperSamochod nieJakisTamOpel = new SuperSamochod("Zielony",2015,"Fiat 126p");


        System.out.println(ope1l.equals(opel));

        for(int i = 0; i < 10; i++){
            nieJakisTamOpel.przyspiesz(200);
        }

        System.out.println(nieJakisTamOpel);
        System.out.println(opel);
    }
}
