import java.util.Scanner;

public class petlaDoWile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;


        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
            for (int i = liczba - 1; i > 0; i--) {
                System.out.println(i);
            }
        } while (liczba != 0);
    }

}
