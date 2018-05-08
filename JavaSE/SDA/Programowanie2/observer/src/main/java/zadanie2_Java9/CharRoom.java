package zadanie2_Java9;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.HashMap;
import java.util.Map;

public class CharRoom {
    private Map<Integer, CharUser> chatroom = new HashMap<>();
    private String roomName;

    private ObjectProperty<Message> messages = new SimpleObjectProperty<>();


    public void addObserver(CharUser user){
        messages.addListener(user);
    }

    public void userLogin(String nick){
        CharUser u = new CharUser(chatroom.size()+1, nick);
        chatroom.put(chatroom.size()+1,u);
    }

    public void sendMessage(int user, String message){
        messages.setValue(new Message(user,message));
    }
}
