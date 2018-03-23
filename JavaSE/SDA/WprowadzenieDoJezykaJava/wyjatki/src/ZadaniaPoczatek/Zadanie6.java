package ZadaniaPoczatek;

import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[20];
        int[] tablicaDruga = new int[11];

        for(int i = 0; i < tablica.length;i++){
            tablica[i] = random.nextInt(10)+1;
        }

        for(int i: tablica){
            tablicaDruga[i] = tablicaDruga[i] +1;
        }

        for(int i = 0; i < tablicaDruga.length; i++){
            System.out.println(i + " - " + tablicaDruga[i]);
        }
    }
}
