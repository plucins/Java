package Zadanie11;

public class Pociag {
    private String id;
    private int numerPociagu;
    private KlasaPociagu klasaPociagu;
    private int maxOpoznienie;
    private int dlugoscPodruzy;
    private int cenaPodrozy;
    private int przebieg;
    private boolean czyWagonSypialny;

    public Pociag(String id, int numerPociagu, KlasaPociagu klasaPociagu, int maxOpoznienie, int dlugoscPodruzy, int cenaPodrozy, int przebieg, boolean czyWagonSypialny) {
        this.id = id;
        this.numerPociagu = numerPociagu;
        this.klasaPociagu = klasaPociagu;
        this.maxOpoznienie = maxOpoznienie;
        this.dlugoscPodruzy = dlugoscPodruzy;
        this.cenaPodrozy = cenaPodrozy;
        this.przebieg = przebieg;
        this.czyWagonSypialny = czyWagonSypialny;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumerPociagu() {
        return numerPociagu;
    }

    public void setNumerPociagu(int numerPociagu) {
        this.numerPociagu = numerPociagu;
    }

    public KlasaPociagu getKlasaPociagu() {
        return klasaPociagu;
    }

    public void setKlasaPociagu(KlasaPociagu klasaPociagu) {
        this.klasaPociagu = klasaPociagu;
    }

    public int getMaxOpoznienie() {
        return maxOpoznienie;
    }

    public void setMaxOpoznienie(int maxOpoznienie) {
        this.maxOpoznienie = maxOpoznienie;
    }

    public int getDlugoscPodruzy() {
        return dlugoscPodruzy;
    }

    public void setDlugoscPodruzy(int dlugoscPodruzy) {
        this.dlugoscPodruzy = dlugoscPodruzy;
    }

    public int getCenaPodrozy() {
        return cenaPodrozy;
    }

    public void setCenaPodrozy(int cenaPodrozy) {
        this.cenaPodrozy = cenaPodrozy;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public boolean isCzyWagonSypialny() {
        return czyWagonSypialny;
    }

    public void setCzyWagonSypialny(boolean czyWagonSypialny) {
        this.czyWagonSypialny = czyWagonSypialny;
    }
}
