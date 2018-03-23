package enumy;

public class MainBilety {

    public static void main(String[] args) {
        Bilet uCalodniowy = Bilet.ULGOWY_CALODNIOWY;
        Bilet uGodzinny = Bilet.ULGOWY_GODZINNY;
        Bilet nCalodniowy = Bilet.NORMALNY_CALODNIOWY;
        Bilet nGodzinny = Bilet.NORMALNY_GODZINNY;

        zakupBilet(19,61,12);





    }

    private static void zakupBilet(int wiek, double czasJazdy, double kwota){
        Bilet zamowiony = Bilet.BRAK_BILETU;

        if(wiek > 18){
            if(czasJazdy >= 60){
                zamowiony = Bilet.NORMALNY_CALODNIOWY;
            }else {
                zamowiony = Bilet.NORMALNY_GODZINNY;
            }
        }else {
            if(czasJazdy >= 60){
                zamowiony = Bilet.ULGOWY_CALODNIOWY;
            }else {
                zamowiony = Bilet.ULGOWY_GODZINNY;
            }
        }

        if(zamowiony.getCena() <= kwota){
            zamowiony.wyswietlDaneOBilecie();
        }else {
            System.out.println("Nie ma wystarczająco pieniędzy");
        }
    }
}
