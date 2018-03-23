import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");
        String wyraz = scanner.nextLine();
        String[] wyrazPoLiterce = wyraz.split("");

        String odwroconyWyraz ="";
        for(int i = wyrazPoLiterce.length-1; i>=0;i--){
            odwroconyWyraz += wyrazPoLiterce[i];
        }
        System.out.println("Wyraz po odwroceniu " + odwroconyWyraz);
    }
}
