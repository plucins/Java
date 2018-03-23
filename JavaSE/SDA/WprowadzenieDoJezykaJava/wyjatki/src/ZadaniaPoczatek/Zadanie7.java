package ZadaniaPoczatek;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        String minus ="";


        String binarna = "";
        if(Integer.toString(liczba).startsWith("-")){
            minus += "1.";
            liczba = Integer.parseInt(Integer.toString(liczba).substring(1));
        }

        for(int i = liczba; i > 0 ; i=i/2){
            if(i % 2 == 0){
                binarna += "0";
            }else {
                binarna += "1";
            }
        }

        System.out.println("Binarne to " + minus + new StringBuilder(binarna).reverse());
    }
}
