package Zadanie8;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Odczyt {
    public static void main(String[] args) {
        System.out.println("Podaj znawe pliku");
        Scanner scanner = new Scanner(System.in);
        String nazwaPliku = scanner.nextLine();

        String linia = "";
        File file = new File(nazwaPliku);
        Long formatTime = file.lastModified();
        try {

        BufferedReader br = new BufferedReader(new FileReader(file));


            while (true) {


                if (file.lastModified() > formatTime || linia != null) {
                    linia = br.readLine();
                    if(linia != null){
                        System.out.println("Odebrano " + linia);
                    }

                    formatTime = file.lastModified();
                }else {
                    TimeUnit.SECONDS.sleep(5);
                }
            }





        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
