package ZadaniaPoczatek;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int losowa = new Random().nextInt(99)+1;
        int podana = 0;

        while(losowa != podana){
            System.out.println("Podaj liczbe");
            podana = scanner.nextInt();

            if(podana > losowa){
                System.out.println("Liczba za duża");
            }
            if(podana < losowa){
                System.out.println("Liczba za mała");
            }
        }
        System.out.println("Dobrze!");
    }
}
