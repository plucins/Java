import java.util.Scanner;

public class Metody1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        System.out.println("Podaj dzielnik");
        int dzielnik = scanner.nextInt();

        if(czyPodzielna(liczba,dzielnik)){
            System.out.println("Liczba " + liczba + " jest podzielna przez " + dzielnik);
        } else {
            System.out.println("Liczba " + liczba + " nie jest podzielna przez " + dzielnik);

        }

    }

    private static boolean czyPodzielna(int liczba, int dzielnik){
        return liczba%dzielnik == 0;
    }
}
