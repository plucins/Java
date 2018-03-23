import java.util.Scanner;

public class TestPowturakaTrzy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = scanner.nextInt();
        int wynik = liczba1 + liczba2;

        System.out.println("Wynik dodawania wprowadzony liczb to " + wynik);
    }
}
