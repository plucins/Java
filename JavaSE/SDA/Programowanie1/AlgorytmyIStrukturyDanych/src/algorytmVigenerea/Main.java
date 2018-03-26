package algorytmVigenerea;

public class Main {
    public static void main(String[] args) {
        String wyraz = "makeithappen";
        String haslo = "math";
        VigenerCharacterMap c = new VigenerCharacterMap();

        c.decrypt(c.crypt(wyraz,haslo));

    }
}
