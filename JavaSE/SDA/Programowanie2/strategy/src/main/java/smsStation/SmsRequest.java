package smsStation;

import java.util.List;

public class SmsRequest implements Runnable {
    private String tresc;
    private String numer;
    private List<Phone> listaOdbiorcow;

    public SmsRequest(String tresc, String numer, List<Phone> listaOdbiorcow) {
        this.tresc = tresc;
        this.numer = numer;
        this.listaOdbiorcow = listaOdbiorcow;
    }

    @Override
    public void run() {
        try {
//            for (Phone lista : listaOdbiorcow) {
                Thread.sleep(100 * this.tresc.length());
//                if(this.numer.equals(lista.getNumerTelefonu())) continue;

            for (Phone tel : listaOdbiorcow) {
                System.out.println("wysyłam SMS o tresci " + this.tresc + " do " + tel.getNumerTelefonu());
                tel.dodajWiadomosc(new Message(numer, tresc));
            }
//            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
