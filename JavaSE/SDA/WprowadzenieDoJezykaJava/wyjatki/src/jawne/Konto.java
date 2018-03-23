package jawne;

public class Konto {

    String imie;
    int kwotaStartowa;
    int stanKonta;

    public Konto(String imie, int kwotaStartowa) {
        this.imie = imie;
        this.kwotaStartowa = kwotaStartowa;
        this.stanKonta = kwotaStartowa;
    }

    public int wybierzPieniadze(int kwota) {
        this.stanKonta -= kwota;
        return kwota;
    }

    public int pobierzStanKonta() {
        return this.stanKonta;
    }

}
