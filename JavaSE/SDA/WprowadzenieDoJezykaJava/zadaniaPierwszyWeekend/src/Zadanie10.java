import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wprowadzonyCiag = scanner.nextLine();

        String[] liczbyPobrane = wprowadzonyCiag.split(",");
        String[] unikalneLiczby = new String[liczbyPobrane.length];

        for(int i = 0; i < liczbyPobrane.length; i++){
            if (isUnique(liczbyPobrane[i],unikalneLiczby)){
                unikalneLiczby[i] = liczbyPobrane[i];
            }
        }

        for(int i = 0; i < unikalneLiczby.length;i++){
            System.out.println(unikalneLiczby[i]);
        }



    }

    private static boolean isUnique(String liczba, String[] tab){
        for(int i = 0; i < tab.length;i++){
            if(tab[i].equals(liczba)) return true;
        }
        return false;
    }


}
