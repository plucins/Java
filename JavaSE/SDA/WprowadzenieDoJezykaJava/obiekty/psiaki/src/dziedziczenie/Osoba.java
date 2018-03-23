package dziedziczenie;

public class Osoba {
    final protected String imie;
    final protected String nazwisko;
    final protected int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void przedstawSie(){
        System.out.println(String.format("Cześć jestem %s, mam %d lat",imie,wiek));
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",imie,nazwisko,wiek);
    }
}
