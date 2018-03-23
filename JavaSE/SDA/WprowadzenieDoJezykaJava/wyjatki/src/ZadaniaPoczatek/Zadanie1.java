package ZadaniaPoczatek;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println("sprawdź czy w tekście występuje słowo “ania”");
        System.out.println(text.contains("ania"));
        System.out.println("sprawdź czy tekst zaczyna się od słowa “ania”");
        System.out.println(text.startsWith("ania"));
        System.out.println("sprawdź czy tekst kończy się słowem “ania”");
        System.out.println(text.endsWith("ania"));
        System.out.println("sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania”");
        System.out.println(text.toLowerCase().contains("ania"));
        System.out.println("sprawdź czy tekst równa się słowu “ania”");
        System.out.println(text.equals("ania"));
        System.out.println("zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście");
        System.out.println(text.indexOf("ania"));



        for(int i = 97; i < 123; i++ ){
            System.out.print((char) i);
        }


    }
}
