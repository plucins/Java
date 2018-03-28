package algorytmy.Zadanie5;

public class Main {

//    Przygotuj algorytm wyświetlający palindrom,
//    czyli liczbę, która czytana od tyłu będzie taka sama jak od przodu.

    public static void main(String[] args) {
        String wyraz = "zaradnydyndaraz";

        for(int i = 0; i < wyraz.length()%2; i++){
            System.out.println(wyraz.charAt(i) == wyraz.charAt(wyraz.length()-i-1));
        }
    }
}
