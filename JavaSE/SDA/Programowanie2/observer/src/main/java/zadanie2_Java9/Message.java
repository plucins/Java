package zadanie2_Java9;

public class Message {
    private int nadawcaId;
    private String tresc;

    public Message(int nadawcaId, String tresc) {
        this.nadawcaId = nadawcaId;
        this.tresc = tresc;

    }

    public int getNadawcaId() {
        return nadawcaId;
    }

    public void setNadawcaId(int nadawcaId) {
        this.nadawcaId = nadawcaId;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String toString() {
        return "Message{" +
                "nadawcaId=" + nadawcaId +
                ", tresc='" + tresc + '\'' +
                '}';
    }
}
