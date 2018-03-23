package pl.sda.metody.zajecia;

public class ImionaPogrupowane {


    static void wyswietlImionaMeskie(String[] imiona) {
        for (String imie : imiona){
            if(!czyImieZenskie(imie)){
                System.out.println(imie);
            }
        }
    }

    static void wyswietlImionaZenskie(String[] imiona) {
        for (String imie : imiona){
            if(czyImieZenskie(imie)){
                System.out.println(imie);
            }
        }
    }

    static void wystwietWszystkieImiona(String[] imiona) {
        System.out.println("Wszystkie imiona");
        for(String imie : imiona){
            System.out.println(imie);
        }
    }

    static boolean czyImieZenskie(String imie) {
        if(imie.endsWith("a") && !imie.equalsIgnoreCase("Kuba")){
            return true;
        }
        return false;
    }


}
