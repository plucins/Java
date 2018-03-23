package jawne;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InsufficientFundsException {
        System.out.println("Czy chcesz utworzyć nowe konto?");
        boolean czyNoweKonto = pobierzTakNieOdUzytkownika();
        if (!czyNoweKonto){
            zakonczProgram();
        }
        Konto konto = utworzNoweKonto();
        System.out.println("Czy chcesz pobrać środki z konta?");
        boolean czyPobracSrodki = pobierzTakNieOdUzytkownika();
        if(!czyPobracSrodki){
            zakonczProgram();
        }
        System.out.println("Ile środków chcesz pobrać?");
        int kwota = pobierzLiczbe();
        if(kwota > konto.pobierzStanKonta()){
                throw new InsufficientFundsException("Brak wystarczajaco środków na koncie");
        }
        konto.wybierzPieniadze(kwota);
        System.out.printf("Dziękujemy za skorzystanie z usług.\nTwój aktualny stan konta to %d BTC ;)", konto.pobierzStanKonta());
    }

    private static Konto utworzNoweKonto() {
        System.out.println("Podaj swoje imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj kwotę jaką chcesz wpłacić na swoje konto");
        int kwotaStartowa = pobierzLiczbe();
        return new Konto(imie, kwotaStartowa);
    }

    private static int pobierzLiczbe(){
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.err.println("Wprowadzono błędną wartość");
            return pobierzLiczbe();
        }
    }

    private static void zakonczProgram() {
        System.out.println("Dziękujemy za skorzystanie z aplikacji!");
        System.exit(0);
    }

    private static boolean pobierzTakNieOdUzytkownika() {
        String odpowiedz = scanner.nextLine();
        if(odpowiedz.toLowerCase().contains("t")){
            return true;
        }else if(odpowiedz.toLowerCase().contains("n")){
            return false;
        }else{
            System.out.println("Wpisz 'tak' lub 'nie'");
            return pobierzTakNieOdUzytkownika();
        }
    }
}
