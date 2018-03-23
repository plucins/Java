import java.util.Arrays;
import java.util.Scanner;

public class TabliceDwa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile licz chcesz podac");
        int[] tablica = new int[scanner.nextInt()];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + ((int) i + 1) + " element");
            tablica[i] = scanner.nextInt();
        }

        int najwieksza = tablica[0];
        int najmniejsza = tablica[0];
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (najwieksza < tablica[i]) {
                najwieksza = tablica[i];
            }
            if (najmniejsza > tablica[i]) {
                najmniejsza = tablica[i];
            }
            suma += tablica[i];
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println("Najwieksza liczba w podanym zbiorze to " + najwieksza);
        System.out.println("Najmniejsza liczba w podanym zbiorze to " + najmniejsza);
        System.out.println("Suma wszystkich wartosci to " + suma);

        Arrays.sort(tablica);

        System.out.println("Srednia liczba to " + (double) suma / tablica.length);
        double mediana;
        if (tablica.length % 2 == 0) {
            mediana = (tablica[tablica.length / 2] + tablica[(tablica.length / 2) - 1]) / 2;
        } else {
            mediana = tablica[tablica.length / 2];
        }
        System.out.println("Mediana to " + mediana);


    }
}
