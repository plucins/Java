package ZadaniaPoczatek;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wyraz = "Ikar łapał raki".toLowerCase();
        boolean czyJestOk = false;

        for(int i = 0; i < wyraz.length()/2; i++ ){
            if(wyraz.charAt(i) == wyraz.charAt(wyraz.length()-i-1)){
                czyJestOk = true;
            }else {
                czyJestOk = false;
            }
        }

        if(czyJestOk) System.out.println("to jest palindromem");
    }
}
