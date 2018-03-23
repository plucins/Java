package obiekty;

public class Osoba {
    String imie;
    int rokUrodzenia;
    boolean czyKobieta;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba() {}

    public static void main(String[] args) {
        Osoba osoba = new Osoba();

        Osoba ania = new Osoba("Ania", 1993);
        Osoba andrzej = new Osoba("Andrzej", 1964);
        Osoba mariola = new Osoba("Mariola", 1950);

        Osoba[] osoby = new Osoba[]{ania, andrzej, mariola};

        System.out.println("Wszystkie osoby");
        osoba.wszystieOsoby(osoby);

        System.out.println("Tylko Panie");
        osoba.tylkoPanie(osoby);

        System.out.println("Tylko Panowie");
        osoba.tylkoPanowie(osoby);

    }

    private void przedstawSie(Osoba osoba) {
        System.out.println("Czesc, mam na imie " + osoba.imie + " i mam " + (2018 - osoba.rokUrodzenia) + " lat");

    }

    private void wszystieOsoby(Osoba[] osoby){
        for(Osoba osoba: osoby){
            przedstawSie(osoba);
        }
    }

    private void tylkoPanie(Osoba[] osoby){
        for(Osoba osoba: osoby){
            if(osoba.imie.endsWith("a")){
                przedstawSie(osoba);
            }
        }
    }
    private void tylkoPanowie(Osoba[] osoby){
        for(Osoba osoba: osoby){
            if(!osoba.imie.endsWith("a")){
                przedstawSie(osoba);
            }
        }
    }
}
