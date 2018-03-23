import java.util.Random;
import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        String[][] plansza = inicjalizacjaTablicy();
        boolean computer = false;
        String znak = menuStart();

            while (!czyKoniec(plansza, computer)) {
                computer = wskazaniePolaGracz(plansza, znak, computer);
                System.out.print("Tablica po Twoim ruchu");
                wyswietlTablice(plansza);

                if(czyKoniec(plansza,computer)) return;

                System.out.println();
                System.out.println();
                System.out.println("Tablica po ruchu komputera");
                computer = wskazaniePolaKomputer(plansza, znak, computer);
                wyswietlTablice(plansza);
            }

    }

    private static String menuStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze w kolko i krzyzyk na planszy 3x3");
        System.out.println("Wybierz jaka figura grasz");
        System.out.println("1 - Kolko");
        System.out.println("2 - Krzyzyk");
        String znak;
        do {
            znak = scanner.nextLine();
            if (znak.length() > 1) znak = "y";
            switch (znak) {
                case "0":
                    return "zero";
                case "1":
                    return "O";
                case "2":
                    return "X";
                default:
                    System.out.println("Błędny wybor, jeszcze raz");
            }
        } while (!(znak.codePointAt(0) == 79 || znak.codePointAt(0) == 88) || znak.codePointAt(0) == 48);

        return null;

    }

    private static boolean wskazaniePolaKomputer(String[][] plansza, String znak, boolean computer) {
        computer = true;
        boolean jeszczeRaz;
        Random random = new Random();
        if(znak.equals("X")){
            znak = "O";
        }else if(znak.equals("O")) {
            znak = "X";
        }


        do {
            jeszczeRaz = false;
            String wskazanePole = ""+random.nextInt(9);
            switch (wskazanePole) {
                case "0":
                    if (isUnique(plansza[0][0])) {
                        plansza[0][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "1":
                    if (isUnique(plansza[0][1])) {
                        plansza[0][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "2":
                    if (isUnique(plansza[0][2])) {
                        plansza[0][2] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "3":
                    if (isUnique(plansza[1][0])) {
                        plansza[1][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "4":
                    if (isUnique(plansza[1][1])) {
                        plansza[1][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "5":
                    if (isUnique(plansza[1][2])) {
                        plansza[1][2] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "6":
                    if (isUnique(plansza[2][0])) {
                        plansza[2][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "7":
                    if (isUnique(plansza[2][1])) {
                        plansza[2][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "8":
                    if (isUnique(plansza[2][2])) {
                        plansza[2][2] = znak;
                    } else jeszczeRaz = true;
                    break;
            }
        }while (jeszczeRaz);

        return computer;
    }


    private static boolean wskazaniePolaGracz(String[][] plansza, String znak,boolean computer) {
        computer = false;
        Scanner scanner = new Scanner(System.in);
        String wskazanePole;
        boolean jeszczeRaz;

        do {
            jeszczeRaz = false;
            System.out.println();
            System.out.println("Wskaż pole ( nie moze sie powtarzac)");
            wskazanePole = scanner.nextLine();
            if (wskazanePole.length() > 1) wskazanePole = "a";
            switch (wskazanePole) {
                case "0":
                    if(isUnique(plansza[0][0])) {
                        plansza[0][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "1":
                    if(isUnique(plansza[0][1])) {
                        plansza[0][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "2":
                    if(isUnique(plansza[0][2])) {
                        plansza[0][2] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "3":
                    if(isUnique(plansza[1][0])) {
                        plansza[1][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "4":
                    if(isUnique(plansza[1][1])) {
                        plansza[1][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "5":
                    if(isUnique(plansza[1][2])) {
                        plansza[1][2] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "6":
                    if(isUnique(plansza[2][0])) {
                        plansza[2][0] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "7":
                    if(isUnique(plansza[2][1])) {
                        plansza[2][1] = znak;
                    } else jeszczeRaz = true;
                    break;
                case "8":
                    if(isUnique(plansza[2][2])) {
                        plansza[2][2] = znak;
                    } else jeszczeRaz = true;
                    break;
                default:
                    System.out.println("Błędny wybor, jeszcze raz");
                    break;
            }
        } while ((!(wskazanePole.codePointAt(0) > 47 && wskazanePole.codePointAt(0) < 57)) || jeszczeRaz);
        return  computer;
    }

    private static String[][] inicjalizacjaTablicy() {
        String[][] plansza = new String[3][3];
        plansza[0][0] = "-";
        plansza[0][1] = "-";
        plansza[0][2] = "-";
        plansza[1][0] = "-";
        plansza[1][1] = "-";
        plansza[1][2] = "-";
        plansza[2][0] = "-";
        plansza[2][1] = "-";
        plansza[2][2] = "-";


        return plansza;
    }

    private static void wyswietlTablice(String[][] plansza) {
        for (int i = 0; i < plansza.length; i++) {
            System.out.println();
            for (int j = 0; j < plansza.length; j++) {
                System.out.print(plansza[i][j] + " ");
            }
        }
    }

    private static boolean isUnique(String pole) {
        if(pole.equals("-")){
            return true;
        }
        return false;
    }

    private static boolean czyKoniec(String[][] plansza,boolean computer){
        if(plansza[0][0].equals(plansza[1][0]) && plansza[1][0].equals(plansza[2][0]) && !(plansza[2][0].equals("-")) ||
                plansza[0][1].equals(plansza[1][1]) && plansza[1][1].equals(plansza[2][1]) && !(plansza[2][1].equals("-")) ||
                plansza[0][2].equals(plansza[1][2]) && plansza[1][2].equals(plansza[2][2]) && !(plansza[2][2].equals("-")) ||
                plansza[0][0].equals(plansza[0][1]) && plansza[0][1].equals(plansza[0][2]) && !(plansza[0][2].equals("-")) ||
                plansza[1][0].equals(plansza[1][1]) && plansza[1][1].equals(plansza[1][2]) && !(plansza[1][2].equals("-")) ||
                plansza[2][0].equals(plansza[2][1]) && plansza[2][1].equals(plansza[2][2]) && !(plansza[2][2].equals("-")) ||
                plansza[0][0].equals(plansza[1][1]) && plansza[1][1].equals(plansza[2][2]) && !(plansza[2][2].equals("-")) ||
                plansza[0][2].equals(plansza[1][1]) && plansza[1][1].equals(plansza[2][0]) && !(plansza[2][0].equals("-"))){
            System.out.println();
            if(computer){
                System.out.println("Komputer wygrał tą partie");
            } else{
                System.out.println("Pokonałeś komputer!!");
            }
            return true;
        }

        if(!(plansza[0][0].equals("-")) && !(plansza[0][1].equals("-")) && !(plansza[0][2].equals("-")) &&
                !(plansza[1][0].equals("-")) && !(plansza[1][1].equals("-")) && !(plansza[1][2].equals("-")) &&
                !(plansza[2][0].equals("-")) && !(plansza[2][1].equals("-")) && !(plansza[2][2].equals("-"))){
            System.out.println("");
            System.out.println("Remis!");
            return true;
        }


        return false;
    }
}
