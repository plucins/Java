package Zadanie3;

public class Pudelko <T> {
    private T poleTypuGenerycznego;

    public Pudelko(T poleTypuGenerycznego) {
        this.poleTypuGenerycznego = poleTypuGenerycznego;
    }

    public T getPoleTypuGenerycznego() {
        return poleTypuGenerycznego;
    }

    public void setPoleTypuGenerycznego(T poleTypuGenerycznego) {
        this.poleTypuGenerycznego = poleTypuGenerycznego;
    }

    public boolean czyPudelkoJestPuste(){
        return this.poleTypuGenerycznego == null;
    }
}
