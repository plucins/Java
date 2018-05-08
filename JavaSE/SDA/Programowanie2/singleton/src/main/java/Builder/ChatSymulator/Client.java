package Builder.ChatSymulator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Mail> skrzynka = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void readMail(Mail m){
        skrzynka.add(m);
        System.out.println("Klient " + this.getName() + " otrzymał wiadomość");
    }
}
