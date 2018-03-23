package pl.sda.metody.zajecia;

public class Imiona {
    public static void main(String[] args) {
        String[] imiona = new String[]{"Ania","Bartek","Adam","Pawel","Karolina","Tomek","Kuba"};


        System.out.println("Wszystkie imiona");
        ImionaPogrupowane.wystwietWszystkieImiona(imiona);

        System.out.println("Tylko imiona zenskie");
        ImionaPogrupowane.wyswietlImionaZenskie(imiona);

        System.out.println("Tylko imiona meskie");
        ImionaPogrupowane.wyswietlImionaMeskie(imiona);
    }


}
