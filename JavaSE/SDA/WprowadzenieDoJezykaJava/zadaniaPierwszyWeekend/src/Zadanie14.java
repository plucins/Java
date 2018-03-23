import java.util.Random;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char czyKontynuowac;
        double iloscPaliwa = 0;
        double cenaLacznaZaPaliwo = 0;

        System.out.println("Witaj na naszej stacji paliw");
        do {
            double[] tab = tankuj();


            iloscPaliwa += tab[1];
            cenaLacznaZaPaliwo += tab[0] * tab[1];

            System.out.println("Cena za litr paliwa " + tab[0]);
            System.out.println("Ilosc nalanego paliwa " + (double)Math.round((iloscPaliwa)*100)/100);
            System.out.println("Aktualnie do zapłacenia " + (double)Math.round((cenaLacznaZaPaliwo)*100)/100);

            System.out.println("Czy chcesz kontynuowac?");
            System.out.println("t - tak poprosze");
            System.out.println("n - już wystarczy");
            czyKontynuowac = scanner.next().charAt(0);




        }while(czyKontynuowac != 'n');
    }

    private static double[] tankuj(){
        Random random = new Random();
        double[] tablica = new double[2];
        double cenaPaliwa = 4.35;
        double iloscPaliwa = 0;

        iloscPaliwa += (double)Math.round(random.nextDouble()*500)/100;
        tablica[0] = cenaPaliwa;
        tablica[1] = iloscPaliwa;

        return tablica;
    }
}
