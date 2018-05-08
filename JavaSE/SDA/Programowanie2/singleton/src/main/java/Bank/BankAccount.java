package Bank;

public class BankAccount {

    private double stanKonta;
    private final Object lock = new Object();

    public BankAccount() {
        this.stanKonta = 0;
    }

    public synchronized void add(double ile){
        synchronized (lock) {
            stanKonta = stanKonta + ile;
        }
    }
    public synchronized void sub(double ile){
        synchronized (lock) {
            stanKonta = stanKonta - ile;
        }
    }
    public double balance(){
        return stanKonta;
    }
}
