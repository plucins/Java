package Zadanie12;

public class Obywatel {
    private String Imie;
    private String Nazwisko;
    private String Pesel;

    public Obywatel(String imie, String nazwisko, String pesel) {
        Imie = imie;
        Nazwisko = nazwisko;
        Pesel = pesel;
    }

    public Obywatel() {
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Pesel='" + Pesel + '\'' +
                '}';
    }
}
