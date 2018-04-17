package algorytmy.algorytmDijkstry;

import java.util.ArrayList;
import java.util.List;

public class Wierzcholek {
    private int identyfikator;
    private String name;
    private Double distance;

    private String trasa = "";

    private List<Integer> sasiedzi = new ArrayList<>();
    private List<Krawedz> krawedzie = new ArrayList<>();

    public Wierzcholek(int identyfikator, String name) {
        this.identyfikator = identyfikator;
        this.name = name;
        this.distance = Double.POSITIVE_INFINITY;
    }

    public void dodajSasiada(int nr, int waga){
        sasiedzi.add(nr);
        krawedzie.add(new Krawedz(identyfikator,nr,waga));
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<Integer> getSasiedzi() {
        return sasiedzi;
    }

    public void setSasiedzi(List<Integer> sasiedzi) {
        this.sasiedzi = sasiedzi;
    }

    public List<Krawedz> getKrawedzie() {
        return krawedzie;
    }

    public void setKrawedzie(List<Krawedz> krawedzie) {
        this.krawedzie = krawedzie;
    }

    public String getTrasa() {
        return trasa;
    }

    public void setTrasa(String trasa) {
        this.trasa = trasa;
    }
}
