package Zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("output_2.txt"));
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while(line != null){
                System.out.println(line.toLowerCase());
                System.out.println(line.toUpperCase());
                System.out.println(line.trim());
                sb.append(line);
                line = br.readLine();
                sb.append(System.lineSeparator());
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
