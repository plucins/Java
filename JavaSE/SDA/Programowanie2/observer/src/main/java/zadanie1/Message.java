package zadanie1;

public class Message {
    private String doKogo;
    private String tresc;

    public Message(String doKogo, String tresc) {
        this.doKogo = doKogo;
        this.tresc = tresc;
    }

    public String getDoKogo() {
        return doKogo;
    }

    public void setDoKogo(String doKogo) {
        this.doKogo = doKogo;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
