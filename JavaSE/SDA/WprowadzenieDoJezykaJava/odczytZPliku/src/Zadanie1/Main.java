package Zadanie1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("output_1.txt"));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            if(!line.equals("Hello World!")) throw new IOException();

            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        } catch (IOException e) {
            System.err.println("Nie odnaleziono wskazanego pliku lub treść nie jest poprawna");
        }
    }
}
