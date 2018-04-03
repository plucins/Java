package struktury.magazyn;

import java.time.LocalDate;

public class Produkt {
    private int id;
    private LocalDate dataSpożycia;
    private String nazwa;
    private double cena;
    private Kategoria kategoria;
    private Klasa klasa;

    public Produkt(int id, LocalDate dataSpożycia, String nazwa, double cena, Kategoria kategoria) {
        this.id = id;
        this.dataSpożycia = dataSpożycia;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        if(cena < 10 ) {
            klasa = Klasa.NISKA;
        }else {
            klasa = Klasa.WYSOKA;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataSpożycia() {
        return dataSpożycia;
    }

    public void setDataSpożycia(LocalDate dataSpożycia) {
        this.dataSpożycia = dataSpożycia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", dataSpożycia=" + dataSpożycia +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", kategoria=" + kategoria +
                ", klasa=" + klasa +
                '}';
    }
}
