package zadanie2;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class ChatRoom extends Observable {
    private Map<Integer, ChatUser> chatroom = new HashMap<>();
    private String roomName;

    public void userLogin(String nick){
        ChatUser u = new ChatUser(chatroom.size()+1, nick);
        addObserver(u);
        chatroom.put(chatroom.size()+1,u);
    }

    public void sendMessage(int user, String message){
        setChanged();
        notifyObservers(message);
    }

    public void kickUser(int id_kickowanego, int id_kickujacego){
        if(chatroom.get(id_kickujacego).isAdmin()){
            deleteObserver(chatroom.get(id_kickowanego));
            chatroom.remove(id_kickowanego);
        }else {
            System.out.println("Brak uprawnień");
        }
    }
}
