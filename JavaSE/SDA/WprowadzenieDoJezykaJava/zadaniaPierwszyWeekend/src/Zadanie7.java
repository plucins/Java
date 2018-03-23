import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolny ciag znakow");
        liczZnaki(scanner.nextLine());


    }

    private static void liczZnaki(String ciagZnakow){

        String[] tablicaZnakow = ciagZnakow.split("");

        int iloscLiczb = 0;
        int iloscLiter = 0;
        int iloscSpacji = 0;
        int iloscPozostalych = 0;

        for(String znak: tablicaZnakow){
            int ascii = znak.codePointAt(0);
            if(ascii > 47 && ascii < 58){
                iloscLiczb++;
            }else if((ascii > 64 && ascii < 91) || (ascii > 96 && ascii < 123)){
                iloscLiter++;
            } else if(ascii == 32){
                iloscSpacji++;
            } else{
                iloscPozostalych++;
            }
        }

        System.out.println("Podany tekst: " + ciagZnakow + " zawiera");
        System.out.println(iloscLiter + " liter");
        System.out.println(iloscSpacji + " spacji");
        System.out.println(iloscLiczb + " liczb");
        System.out.println(iloscPozostalych + " innych znakow");
    }
}
