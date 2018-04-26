package ConfigSingleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MySetting instance = MySetting.getInstance();

        for(int i = 0; i < instance.getRoundCount(); i++ ){
            int firtArgument = instance.getFromNumber();
            int secondArgument = instance.getToNumber();
            String action = instance.getActions();
            double result = instance.calculate(firtArgument, secondArgument, action);

            System.out.println("Ile wynosi " + firtArgument + " " + action + " " + secondArgument +" ?");
            double resultFromUser = new Scanner(System.in).nextDouble();
            if(result == resultFromUser){
                System.out.println("Zgoda");
            }else {
                System.out.println("Źle");
                System.out.println("Wynik " + result);
            }
        }

    }
}
