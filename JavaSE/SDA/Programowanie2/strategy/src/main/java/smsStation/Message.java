package smsStation;

public class Message {
    private String nadawca;
    private String tresc;

    public Message(String nadawca, String tresc) {
        this.nadawca = nadawca;
        this.tresc = tresc;
    }

    public String getNadawca() {
        return nadawca;
    }

    public void setNadawca(String nadawca) {
        this.nadawca = nadawca;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
