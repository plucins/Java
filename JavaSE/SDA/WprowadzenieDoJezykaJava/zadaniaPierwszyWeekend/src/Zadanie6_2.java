import java.util.Random;
import java.util.Scanner;

public class Zadanie6_2 {
    public static void main(String[] args) {
        int haslo = (int) (Math.random() * 9000) + 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadywanka");

        String podpowiedz = "";
        int iloscSzans = 5;
        boolean uzyciePodpowiedzi = false;

        while (iloscSzans > 0) {
            System.out.println("Masz " + iloscSzans + " szans na odgadniecie hasla");
            if (!uzyciePodpowiedzi) {
                System.out.println("Jeżeli chcesz uzyskac podpowiedz wpisz - 00");
            } else {
                System.out.println("Podpowiedz -> " + podpowiedz);
            }
            System.out.println("Podaj liczbe");
            int podana = scanner.nextInt();

            if (podana == 00 && !uzyciePodpowiedzi) {
                String a = "" + haslo;
                String gwiazdki = "****";
                Random random = new Random();
                int losowa = random.nextInt(4);
                podpowiedz = gwiazdki.substring(1, losowa + 1) + a.charAt(losowa) + gwiazdki.substring(losowa + 1);
                uzyciePodpowiedzi = true;
                continue;
            }


            if (haslo < podana) {
                System.out.println("Za duża...");
            } else if (haslo > podana) {
                System.out.println("Za mała...");
            } else if (haslo == podana) {
                System.out.println("Brawo, ogadłeś");
                return;
            }
            iloscSzans--;

            if (iloscSzans == 0) {
                System.out.println("Jeżeli chcesz grać dalej wpisz - 'Tak'");
                scanner.nextLine();
                if (scanner.nextLine().equals("Tak")) {
                    iloscSzans = 5;
                }
            }
        }
    }
}
