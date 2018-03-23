import java.util.Random;
import java.util.Scanner;

public class Zadanie5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hasla = new String[]{"krokodyl", "doniczka", "kalosz", "kolorowanka", "kolekcjoner", "makówka", "betoniarka"};
        String wylosowaneHaslo = wylosujzHaslo(hasla);
        int iloszczSzans = 5;


        while (iloszczSzans > 0) {
            System.out.println("Podaj jedna litere");
            char litera = scanner.nextLine().charAt(0);



            if (czzHasloZawieraLitere(wylosowaneHaslo, litera)) {
                System.out.println(pokazLitery(wylosowaneHaslo, litera));
            } else {
                System.out.println("Nie ma takiej litery - tracisz jedna szanse");
                iloszczSzans--;
            }
        }


    }

    private static String pokazLitery(String haslo, char litera) {
        String gwiazdki = wygenerujZaszyfrowane(haslo);
        for (int i = 1; i <= haslo.length(); i++) {
            if (haslo.charAt(i) == litera) {
                System.out.println(haslo);
                gwiazdki = gwiazdki.substring(1, i+1) + haslo.charAt(i) + gwiazdki.substring(i);
            }
        }
        return gwiazdki;
    }


    private static String wygenerujZaszyfrowane(String haslo){
        String gwiazdki ="";
        for(int i = 0; i < haslo.length(); i++){
            gwiazdki += "*";
        }

        return gwiazdki;
    }




    private static String wylosujzHaslo(String[] tablica) {
        Random random = new Random();
        return tablica[random.nextInt(tablica.length - 1)];
    }

    private static boolean czzHasloZawieraLitere(String tekst, char litera) {
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == litera) {
                return true;
            }
        }
        return false;
    }
}
