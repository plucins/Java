package zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Mail> inbox = new ArrayList<>();

    public void readMail(Mail m){
        inbox.add(m);
        System.out.println("Klient otrzymal " + this.name + " otrzymal maila");
    }
}
