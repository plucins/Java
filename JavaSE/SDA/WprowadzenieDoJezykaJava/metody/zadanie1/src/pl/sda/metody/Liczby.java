package pl.sda.metody;

public class Liczby {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10;i++) {
            drukujParzystoscLiczby(i);
        }
    }

    private static void drukujParzystoscLiczby(int liczba){
        if(czyLiczbaParzysta(liczba)){
            System.out.println("Liczba jest parzysta");
        }else {
            System.out.println("Liczba nie jest parzysta");
        }
    }

    private static boolean czyLiczbaParzysta(int liczba){
        return (liczba%2 == 0);
    }
}