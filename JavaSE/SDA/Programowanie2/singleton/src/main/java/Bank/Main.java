package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        for(int i = 0; i < 1000; i++){
            bank.sendAddToAccountRequest(100);
            bank.sendSubtractRequest(100);
        }


       Scanner scanner = new Scanner(System.in);
        while(true) {
            if(scanner.nextLine().equals("quit")) break;
            bank.printBalanceRequest();
        }
    }
}
