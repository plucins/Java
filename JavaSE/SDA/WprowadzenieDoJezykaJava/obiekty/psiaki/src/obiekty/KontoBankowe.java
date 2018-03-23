package obiekty;

public class KontoBankowe {
    private  long numerKonta;
    private int stanKonta;

    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }


    public void wyswietlStanKonta(){
        System.out.println("Aktualny stan konta - "+stanKonta);
    }

    public void wplacSrodki(int ilosc){
        System.out.println("+" + ilosc + "zl");
        this.stanKonta += ilosc;
    }

    public int pobierzSrodki(int ilosc){
        if(this.stanKonta >= ilosc){
            this.stanKonta -= ilosc;
            System.out.println("-" + ilosc + " zl");
        }else{
            System.out.println("Brak wystarczajacych srodkow na koncie");
            return 0;
        }

        return  ilosc;
    }
}