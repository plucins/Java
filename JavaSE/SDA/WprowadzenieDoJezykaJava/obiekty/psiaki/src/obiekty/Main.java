package obiekty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zagraj zagraj = new Zagraj();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe maksymalna zakresu");
        zagraj.setLiczba(zagraj.wylosujLiczbe(scanner.nextInt()));


        int liczbaSzans = 5;

        while(liczbaSzans > 0 ) {
            System.out.println("Jak myslisz jaka to liczba");
            int podanaLiczba = scanner.nextInt();

            if (zagraj.getLiczba() < podanaLiczba) {
                System.out.println("Liczba za duza");
            } else if(zagraj.getLiczba() > podanaLiczba){
                System.out.println("Liczba za mala");
            }

            if(zagraj.getLiczba() == podanaLiczba){
                System.out.println("Brawo wygrales!!");
                return;
            }

            liczbaSzans--;
        }
    }
}
