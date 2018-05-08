package Bank;

public class BankRequest implements Runnable {
    private BankAccount bankAccount;
    private double kwotaPrzelewu;
    private KIERUNEK_PRZELEWU kierunek_przelewu;

    public BankRequest(BankAccount bankAccount, double kwotaPrzelewu, KIERUNEK_PRZELEWU kierunek_przelewu) {
        this.bankAccount = bankAccount;
        this.kwotaPrzelewu = kwotaPrzelewu;
        this.kierunek_przelewu = kierunek_przelewu;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (kierunek_przelewu == KIERUNEK_PRZELEWU.WYCHODZACY) {
            bankAccount.sub(kwotaPrzelewu);
        }else if(kierunek_przelewu == KIERUNEK_PRZELEWU.PRZYCHODZACY){
            bankAccount.add(kwotaPrzelewu);
        }
    }


}
