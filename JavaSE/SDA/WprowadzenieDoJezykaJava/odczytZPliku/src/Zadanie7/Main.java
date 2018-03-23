package Zadanie7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku");
        String sciezkaPliku = scanner.nextLine();
        System.out.println("Podaj szukany wyraz");
        String wyraz = scanner.nextLine();
        int licznik = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(sciezkaPliku));
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while(line != null){
                List<String> lista = new ArrayList<>();

                lista = Arrays.asList(line.split(" "));

                for(String s: lista){
                    if (s.equals(wyraz)) licznik++;
                }
                line = br.readLine();
            }

            System.out.println("Wyrazow " + wyraz + " wystapilo " + licznik);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
