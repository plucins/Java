package szyfrCezara;

public class Main {
    public static void main(String[] args) {
        String tekst = "qwertyuiop".toLowerCase();
        int liczba;
        String tekstZaszyfrowany = "";

        for (int i = 0; i < tekst.length(); i++) {
            liczba = 5;

            if ((int) tekst.charAt(i) + liczba > 122) liczba -= 26;
            tekstZaszyfrowany = tekstZaszyfrowany + (char) ((int) tekst.charAt(i) + liczba);
        }

        System.out.println("Tekst zaszyfrowany " + tekstZaszyfrowany);

        String tekstOdszyfrowany = "";
        for (int j = 0; j < tekstZaszyfrowany.length(); j++) {
            liczba = 5;
            if ((int) tekstZaszyfrowany.charAt(j) - liczba < 97) liczba -= 26;
            tekstOdszyfrowany = tekstOdszyfrowany + (char) ((int) tekstZaszyfrowany.charAt(j) - liczba);
        }

        System.out.println("Tekst odszyfrowany " + tekstOdszyfrowany);
    }
}
