import java.util.Scanner;

public class TestPowrorkaDwa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        for(int i = scanner.nextInt(); i< 100; i++){
            System.out.println(i);
        }
    }
}
