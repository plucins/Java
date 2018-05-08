package Builder.zadanie1;

public class Main {
    public static void main(String[] args) {
        GameCharacter.Builder b = new GameCharacter.Builder("A",10.0,10.0,1);
        b.build();
        GameCharacter g = new GameCharacter(b);
    }
}
