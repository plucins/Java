package restauracja;

import restauracja.model.Restauracja;
import restauracja.zdarzenia.KlientZamowil;
import restauracja.zdarzenia.KlientZaplacil;
import restauracja.zdarzenia.KlientpRzyszedl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restauracja r = new Restauracja();

        Scanner s = new Scanner(System.in);
        boolean isWordkin = true;

        while (isWordkin){
            String linia = s.nextLine();

            String[] kolumny = linia.split(" ");

            if(kolumny[0].equalsIgnoreCase("nowy")){
                EventDispatcher.getInstance().rozeslij(new KlientpRzyszedl(kolumny[1]));
            }else if(kolumny[0].equalsIgnoreCase("wyszedl")){
                EventDispatcher.getInstance().rozeslij(new KlientpRzyszedl(kolumny[1]));
            }else if(kolumny[0].equalsIgnoreCase("zaplacil")){
                EventDispatcher.getInstance().rozeslij(new KlientZaplacil(kolumny[1]));
            }else if(kolumny[0].equalsIgnoreCase("zamowil")){
                EventDispatcher.getInstance().rozeslij(new KlientZamowil(kolumny[1]));
            }
        }
    }
}
