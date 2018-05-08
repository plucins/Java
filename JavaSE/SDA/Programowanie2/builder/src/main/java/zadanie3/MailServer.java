package zadanie3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MailServer {
    List<Client> clientConnected = new ArrayList<>();

    public void connect(Client c){
        clientConnected.add(c);
    }

    public void disconect(Client c){
        clientConnected.remove(c);
    }

    public void sendMessage(Mail m, Client sender){
        for(Client c: clientConnected){
            if(!c.equals(sender)){
                m.setDataOdbioru(LocalDate.now());
                c.readMail(m);
            }
        }
    }
}
