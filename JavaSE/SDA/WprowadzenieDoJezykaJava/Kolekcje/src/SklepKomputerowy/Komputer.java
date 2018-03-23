package SklepKomputerowy;

public class Komputer {
    private int identyfikatorProduktu;
    private double czestotliwoscProcesora;
    private boolean czyProcesorMaTurbo;
    private double wielkoscPamieciRAM;
    private double wielkoscDysku;
    private double cena;
    private int iloscProcesorow;
    private String nazwa;
    private int pobieranaMoc;

    public Komputer(int identyfikatorProduktu, double czestotliwoscProcesora, boolean czyProcesorMaTurbo, double wielkoscPamieciRAM, double wielkoscDysku, double cena, int iloscProcesorow, String nazwa, int pobieranaMoc) {
        this.identyfikatorProduktu = identyfikatorProduktu;
        this.czestotliwoscProcesora = czestotliwoscProcesora;
        this.czyProcesorMaTurbo = czyProcesorMaTurbo;
        this.wielkoscPamieciRAM = wielkoscPamieciRAM;
        this.wielkoscDysku = wielkoscDysku;
        this.cena = cena;
        this.iloscProcesorow = iloscProcesorow;
        this.nazwa = nazwa;
        this.pobieranaMoc = pobieranaMoc;

    }

    public int getIdentyfikatorProduktu() {
        return identyfikatorProduktu;
    }

    public void setIdentyfikatorProduktu(int identyfikatorProduktu) {
        this.identyfikatorProduktu = identyfikatorProduktu;
    }

    public double getCzestotliwoscProcesora() {
        return czestotliwoscProcesora;
    }

    public void setCzestotliwoscProcesora(double czestotliwoscProcesora) {
        this.czestotliwoscProcesora = czestotliwoscProcesora;
    }

    public boolean isCzyProcesorMaTurbo() {
        return czyProcesorMaTurbo;
    }

    public void setCzyProcesorMaTurbo(boolean czyProcesorMaTurbo) {
        this.czyProcesorMaTurbo = czyProcesorMaTurbo;
    }

    public double getWielkoscPamieciRAM() {
        return wielkoscPamieciRAM;
    }

    public void setWielkoscPamieciRAM(double wielkoscPamieciRAM) {
        this.wielkoscPamieciRAM = wielkoscPamieciRAM;
    }

    public double getWielkoscDysku() {
        return wielkoscDysku;
    }

    public void setWielkoscDysku(double wielkoscDysku) {
        this.wielkoscDysku = wielkoscDysku;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscProcesorow() {
        return iloscProcesorow;
    }

    public void setIloscProcesorow(int iloscProcesorow) {
        this.iloscProcesorow = iloscProcesorow;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPobieranaMoc() {
        return pobieranaMoc;
    }

    public void setPobieranaMoc(int pobieranaMoc) {
        this.pobieranaMoc = pobieranaMoc;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "identyfikatorProduktu=" + identyfikatorProduktu +
                ", czestotliwoscProcesora=" + czestotliwoscProcesora +
                ", czyProcesorMaTurbo=" + czyProcesorMaTurbo +
                ", wielkoscPamieciRAM=" + wielkoscPamieciRAM +
                ", wielkoscDysku=" + wielkoscDysku +
                ", cena=" + cena +
                ", iloscProcesorow=" + iloscProcesorow +
                ", nazwa='" + nazwa + '\'' +
                ", pobieranaMoc=" + pobieranaMoc +
                '}';
    }
}
