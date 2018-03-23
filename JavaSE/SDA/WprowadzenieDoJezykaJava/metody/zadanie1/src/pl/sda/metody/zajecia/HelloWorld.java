package pl.sda.metody.zajecia;

public class HelloWorld {
    public static void main(String[] args) {
        hello();
        hello("Adam");
    }

    private static void hello() {
        System.out.println("Hello World!");
    }

    static void hello(String imie){
        System.out.println("hello " + imie);
    }
}
