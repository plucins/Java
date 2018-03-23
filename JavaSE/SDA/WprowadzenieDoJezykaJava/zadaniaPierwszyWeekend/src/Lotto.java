import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int[] tablicaLotto = getNumbersFromUser();
        int[] wylosowaneLiczby = new int[6];

        System.out.println("Wylosowane liczby");
        for (int i = 0; i < 6; i++) {
            int liczba = generateRandom(wylosowaneLiczby);
            System.out.print(liczba + " ");
            wylosowaneLiczby[i] = liczba;
        }

        System.out.println();
        System.out.println("Wytypowales liczby");
        for (int i : tablicaLotto) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Trafiles " + compareTable(wylosowaneLiczby, tablicaLotto));

    }


    private static int generateRandom(int[] randomNubersTable) {
        Random random = new Random();
        int generatedNumber;

        do {
            generatedNumber = random.nextInt(49) + 1;

        } while (isUnique(generatedNumber, randomNubersTable));

        return generatedNumber;
    }


    private static int[] getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] tablicaLotto = new int[6];
        int pointedNumber;

        for (int i = 0; i < 6; i++) {
            do {
                System.out.println("Podaj " + ((int) i + 1) + " liczbe, nie moze sie powtazac");
                pointedNumber = scanner.nextInt();

            } while (isUnique(pointedNumber, tablicaLotto));

            tablicaLotto[i] = pointedNumber;
        }
        return tablicaLotto;
    }

    private static int compareTable(int[] generated, int[] pointed) {
        int ile = 0;
        for (int i = 0; i < generated.length; i++) {
            for (int j = 0; j < pointed.length; j++) {
                if (generated[i] == pointed[j]) {
                    ile++;
                }

            }
        }
        return ile;
    }

    private static boolean isUnique(int liczba, int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == liczba) return true;
        }
        return false;
    }
}
