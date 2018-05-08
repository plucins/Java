package zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ChatUser implements Observer {
    private int id;
    private String nick;
    private List<String> messages = new ArrayList<>();
    private boolean isAdmin = false;

    public ChatUser(int id, String nick) {
        this.id = id;
        this.nick = nick;
        if(nick.equals("administrator") || nick.equals("admin")){
            this.isAdmin = true;
        }
    }


    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            String wiadomosc = (String) arg;
            messages.add(wiadomosc);
            System.out.println("Użytkownik " + this.nick + " otrzymal wiadomosc " + wiadomosc);
        }
    }
}
