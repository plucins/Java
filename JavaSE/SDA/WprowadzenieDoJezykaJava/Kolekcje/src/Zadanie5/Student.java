package Zadanie5;

import java.util.List;

public class Student {
    private List<Double> listaOcen;
    private long numerIndeksu;
    private String imie;
    private String lastName;

    public Student(List<Double> listaOcen, long numerIndeksu, String imie, String lastName) {
        this.listaOcen = listaOcen;
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.lastName = lastName;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public long getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
