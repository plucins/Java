package Zadanie1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String akcja ="";

        while(!akcja.equals("quit")) {
            akcja = scanner.nextLine();

            switch (akcja) {
                case "date":
                    System.out.println(LocalDate.now());
                    break;
                case "time":
                    System.out.println(LocalTime.now());
                    break;
                case "datetime":
                    System.out.println(LocalDateTime.now());
                    break;
                case "quit":
                    return;
            }
        }
    }
}
