package Zadanie1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wyraz ="";

        while (!wyraz.equals("quit")) {
            PrintWriter out = null;
            try {
                out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
                out.println(wyraz);
                wyraz = scanner.nextLine();


            } catch (IOException e) {
                e.printStackTrace();
            }

            out.flush();
            out.close();

        }
    }
}
