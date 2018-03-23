import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby w jednym ciagu");
        String pobranaLiczba = scanner.nextLine();
        String[] pojedyneLiczby = pobranaLiczba.split("");
        int suma = 0;

        for(int i = 0; i < pojedyneLiczby.length;i++){
            suma += Integer.parseInt(pojedyneLiczby[i]);
        }

        System.out.println("Wynik wprowadzonych liczb to " + suma);
    }
}
