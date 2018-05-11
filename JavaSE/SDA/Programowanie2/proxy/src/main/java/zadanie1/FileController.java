package zadanie1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController implements IFileController {
    private String nazwaPliku;
    private Scanner scanner;

    FileController(String nazwaPliku) throws FileNotFoundException {
        this.nazwaPliku = nazwaPliku;
        scanner = new Scanner(new File(nazwaPliku+".txt"));

    }

    public String wczytajLinie() throws IOException {
        if (!scanner.hasNext()) przewinPlik();
        return scanner.nextLine();
    }

    public void przewinPlik() throws IOException {
        scanner.close();
        new FileController(nazwaPliku);
    }

    public void zamknijPlik(){
        scanner.close();
    }

    public void pominLinie(){
        scanner.nextLine();
    }

    @Override
    public void pominN(int ilosc) throws IOException {
        while (ilosc-- > 0){
            if(!scanner.hasNext()) przewinPlik();
            scanner.nextLine();
        }
    }

    @Override
    public List<String> wczytajNLinii(int ilosc) throws IOException {
        List<String> list = new ArrayList<>();
        while (ilosc-- > 0){
            if(!scanner.hasNext()) przewinPlik();
            list.add(scanner.nextLine());
        }

        return list;
    }




}
