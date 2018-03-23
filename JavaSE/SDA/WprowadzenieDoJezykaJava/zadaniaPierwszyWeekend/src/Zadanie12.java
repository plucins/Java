import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilosc licz");
        int liczba = scanner.nextInt();

        for(int i = 1; i <= liczba; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
        }
    }
}
