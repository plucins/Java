package algorymtEuklidesa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj lczbę pierwszą");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbe");
        int liczba2 = scanner.nextInt();

        if(liczba1 < 0 || liczba2 < 0 ) throw new IllegalArgumentException();

        while(liczba1 != liczba2){
            if(liczba1 > liczba2){
                liczba1 -= liczba2;
            }else {
                liczba2 -= liczba1;
            }
        }

        System.out.println(liczba1);



    }

//    i -> od uzytkownika;
//    j -> od uzytkownika;
//    dopoki i-j != 0
//       jeżeli ( i > j)
//           i = i - j
//       jeżeli nie
//           j = j - i
//
}
