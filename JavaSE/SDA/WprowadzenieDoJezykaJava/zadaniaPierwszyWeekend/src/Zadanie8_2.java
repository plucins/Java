import java.util.Scanner;

public class Zadanie8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst do sprawdzenia");
        String[] tekst = scanner.nextLine().split(" ");
        int liczbaWyrazow = 0;
        double dlugoscSlowa = 0;
        int najwiekszaIloscWystapien = 0;
        String najczestszeSlowo ="";
        int najmniejszaIloscWystapien = 0;
        String najrzadszeSlowo = "";

        for (int i = 0; i < tekst.length; i++) {
            dlugoscSlowa += tekst[i].length();
            liczbaWyrazow++;
            if(najwiekszaIloscWystapien < iloscWystapien(tekst,tekst[i])){
                najwiekszaIloscWystapien = iloscWystapien(tekst,tekst[i]);
                najczestszeSlowo = tekst[i];
            }
        }
        najmniejszaIloscWystapien = najwiekszaIloscWystapien;
        for(int i = 0; i < tekst.length; i++){
            if(najmniejszaIloscWystapien > iloscWystapien(tekst,tekst[i])){
                najmniejszaIloscWystapien = iloscWystapien(tekst,tekst[i]);
                najrzadszeSlowo = tekst[i];
            }
        }

        System.out.println("Ilość wyrazow " + liczbaWyrazow);
        System.out.println("Srednia dlugosc wyrazu " + dlugoscSlowa / liczbaWyrazow);
        System.out.println("Najczesciej wystapilo " + najczestszeSlowo + " " + najwiekszaIloscWystapien + " razy");
        System.out.println("Najrzadziej wystapilo " + najrzadszeSlowo + " " + najmniejszaIloscWystapien + " razy");

    }

    private static int iloscWystapien(String[] tablica,String wyraz) {
        int ilosc = 0;
        for(int i = 0; i < tablica.length;i++){
            if(tablica[i].equals(wyraz)){
                ilosc++;
            }
        }
        return ilosc;
    }
}
