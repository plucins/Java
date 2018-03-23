package Zadanie3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("output_3.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            int words = 0;
            int lines = 0;

            while(line != null){
                words += line.split("").length;
                lines++;
                line = br.readLine();
            }

            System.out.println("wyrazow " + words);
            System.out.println("linii " + lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
