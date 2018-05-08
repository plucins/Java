package zadanie2;

public class Main {
    public static void main(String[] args) {
        ChatRoom r = new ChatRoom();
        r.userLogin("Adam");
        r.userLogin("Jan");


        r.sendMessage(1,"Wiadomosc do adama ");

    }
}
