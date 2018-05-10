package smsStation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmsStation {
    private List<Phone> phonesConnected = new ArrayList<>();

    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    public  void addClient(Phone p){
        phonesConnected.add(p);
    }

    public void disconnectPhone(Phone p){
        phonesConnected.remove(p);
    }

    public void sendSms(String numer, String tresc){
        executorService.submit(new SmsRequest(tresc,numer,phonesConnected));

    }

    public List<Phone> getPhonesConnected() {
        return phonesConnected;
    }


}
