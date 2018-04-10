package struktury.dziennikSzkolny;

public class DaneStudenta {
    private String imie;
    private String nazwisko;
    private String numerIndexu;

    public DaneStudenta(String imie, String nazwisko, String numerIndexu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndexu = numerIndexu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerIndexu() {
        return numerIndexu;
    }

    public void setNumerIndexu(String numerIndexu) {
        this.numerIndexu = numerIndexu;
    }

    @Override
    public String toString() {
        return "DaneStudenta{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerIndexu='" + numerIndexu + '\'' +
                '}';
    }
}
