import java.util.Scanner;

public class Zadanie7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo");
        String slowo = scanner.nextLine();
        System.out.println("Ilosc powtorzen");
        int ilosc = scanner.nextInt();

        powtorzenia(slowo,ilosc);
    }

    private static void powtorzenia(String slowo, int ilosc){
        do {
            System.out.println(slowo);
        }while(--ilosc > 0);
    }
}
