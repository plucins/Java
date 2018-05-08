package Builder.ChatSymulator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MailServer {
    private List<Client> clientList = new ArrayList<>();

    public void connect(Client c){
        clientList.add(c);
    }

    public void disconect(Client c){
        clientList.remove(c);
    }

    public void sendMessage(Mail m, Client sender){
        for(Client c: clientList){
            if(c.equals(sender)) continue;
            m.setDataOdbioru(LocalDate.now());
            c.readMail(m);
        }
    }
}
