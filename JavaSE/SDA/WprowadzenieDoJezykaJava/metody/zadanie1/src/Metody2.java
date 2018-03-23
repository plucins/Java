import java.util.Scanner;

public class Metody2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rodzaj dzialania");
        String znak = scanner.nextLine();
        System.out.println("Podaj pierwsza liczbe");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = scanner.nextInt();

        wykonajDzialanie(liczba1,liczba2,znak);

    }

    private static double wykonajDzialanie(int liczba1, int liczba2, String znak){

        double wynik = 0;

        switch (znak){
            case "+":
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania " + liczba1 + " i " + liczba2 + " to " + wynik);
                break;
            case "-":
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania " + liczba1 + " i " + liczba2 + " to " + wynik);
                break;

            case "*":
                wynik = liczba1 * liczba2;
                System.out.println("Wynik mnozenia " + liczba1 + " i " + liczba2 + " to " + wynik);
                break;

            case "/":
                wynik = liczba1 / liczba2;
                System.out.println("Wynik dzielenia " + liczba1 + " i " + liczba2 + " to " + wynik);
                break;

            default:
                System.out.println("Znak nie jest obslugiwany");
        }

        return wynik;
    }
}
