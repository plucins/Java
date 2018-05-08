package zadanie2_Java9;

public class Main {
    public static void main(String[] args) {
        CharRoom r = new CharRoom();
        r.addObserver(new CharUser(1,"Adam"));
        r.addObserver(new CharUser(2,"Piotr"));
        r.addObserver(new CharUser(3,"Rafał"));

        r.sendMessage(1,"wiadomosc, która wysyłam");
    }
}
