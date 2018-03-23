package ZadaniaPoczatek;

public class Zadanie3 {
    public static void main(String[] args) {
        String a = "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))";
        int otwierajacy = 0;
        int zamykajacych = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                otwierajacy++;
            }
            if(a.charAt(i) == ')'){
                zamykajacych++;
            }
            if(zamykajacych > otwierajacy){
                System.out.println("błąd");
                return;
            }
        }

        if(!(otwierajacy == zamykajacych)) {
            System.out.println("Błąd");
            return;
        }
        System.out.println("jest ok ");
    }
}
