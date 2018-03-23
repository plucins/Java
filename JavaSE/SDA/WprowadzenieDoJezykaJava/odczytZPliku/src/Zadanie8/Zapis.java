package Zadanie8;

import java.io.*;
import java.util.Scanner;

public class Zapis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku");
        String nazwaPliku = scanner.nextLine();
        String linia = "";

        try {

            while(!linia.equals("quit")) {

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nazwaPliku, true)));

                System.out.println("Podaj wyraz do zapisania");
                linia = scanner.nextLine();
                out.println(linia);
                System.out.println("Przesłałem linie " + linia);

                out.flush();
                out.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
