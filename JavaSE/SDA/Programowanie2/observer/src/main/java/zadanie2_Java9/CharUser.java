package zadanie2_Java9;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;
import java.util.List;

public class CharUser implements ChangeListener<Message> {

    private int id;
    private String nick;
    private List<String> messages = new ArrayList<>();
    private boolean isAdmin = false;

    public CharUser(int id, String nick) {
        this.id = id;
        this.nick = nick;
        if (nick.equals("administrator") || nick.equals("admin")) {
            this.isAdmin = true;
        }
    }

    @Override
    public void changed(ObservableValue<? extends Message> observable, Message oldValue, Message newValue) {
        if (newValue.getNadawcaId() != this.id) {
            System.out.println("Użytkownik " + this.nick + " otrzymal wiadomosc " + newValue);
        }
    }
}
