package Zadanie10;

import java.io.*;
import java.util.Comparator;

public class FileReader {
    public void readFile() throws IOException {

        final String FILENAME = "C:\\Windows\\PFRO.log";
        BufferedReader in;

        in = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(FILENAME)), "UTF-8"));


        int naj = in.lines().max(Comparator.comparingInt(u -> u.length())).get().length();
        System.out.println(naj);
    }

    public static void main(String[] args) {
        try {
            new FileReader().readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
