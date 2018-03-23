import java.util.InputMismatchException;
import java.util.Scanner;

public class TestpowtorkaCztery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int liczbaPobrana;
        int suma = 0;

        while (scanner.hasNextInt()) {

                liczbaPobrana = scanner.nextInt();
                suma += liczbaPobrana;

                System.out.println(suma);


//            } catch (InputMismatchException e) {
//                System.err.println("Konczymy bo nie int");
//                return;
//            }


        }
    }
}
