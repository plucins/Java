package Zadanie1;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            print10Times("a","b","c");
        }
    }

    private static <T> void print10Times(T... obiekt){
        for(int i = 0; i < obiekt.length; i++) {
            System.out.println(obiekt[i].toString());
        }
    }
}
