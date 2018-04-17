import java.util.LinkedList;
import java.util.Queue;

public class Gracz {
    private String imie;
    private Queue<Karta> posiadaneKarty = new LinkedList<>();

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Queue<Karta> getPosiadaneKarty() {
        return posiadaneKarty;
    }

    public void setPosiadaneKarty(Queue<Karta> posiadaneKarty) {
        this.posiadaneKarty = posiadaneKarty;
    }

    public Gracz(String imie) {
        this.imie = imie;
    }

    public Karta getCard(){
        return posiadaneKarty.poll();
    }

    public void pickCard(Karta k){
        posiadaneKarty.add(k);
    }
}
