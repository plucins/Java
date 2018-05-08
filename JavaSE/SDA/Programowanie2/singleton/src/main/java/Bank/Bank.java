package Bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

    private ExecutorService executorService = Executors.newFixedThreadPool(5);
    private BankAccount bankAccount;

    public Bank() {
        this.bankAccount = new BankAccount();
    }

    public void sendSubtractRequest(double howMuch){
        BankRequest request = new BankRequest(bankAccount,howMuch,KIERUNEK_PRZELEWU.WYCHODZACY);
        executorService.submit(request);
    }
    public void sendAddToAccountRequest(double howMuch){
        BankRequest request = new BankRequest(bankAccount,howMuch,KIERUNEK_PRZELEWU.PRZYCHODZACY);
        executorService.submit(request);
    }
    public void printBalanceRequest(){
        System.out.println(bankAccount.balance());
    }
}
