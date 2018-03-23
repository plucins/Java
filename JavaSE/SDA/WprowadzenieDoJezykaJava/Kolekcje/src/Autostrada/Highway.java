package Autostrada;

import java.time.LocalDate;
import java.util.Map;

public class Highway {
    Map<String, VechicleInfo> vechicleInfoList;

    public void vechicleEntry(String licencePlateNumber, CarType carType){
        vechicleInfoList.put(licencePlateNumber,new VechicleInfo(licencePlateNumber,carType,LocalDate.now()));
        System.out.println("Pojazd o numerze rej - " + licencePlateNumber + " wjechał na autostradę");
    }

    public void searchVechicle(String licencePlateNumber){
        if(vechicleInfoList.containsKey(licencePlateNumber)) {
            System.out.println(vechicleInfoList.get(licencePlateNumber));
        }else {
            System.out.println("Pojazdu o numerze rej " + licencePlateNumber + " nie ma na autostradzie");
        }
    }

    public void vechicleLeave(String licencePlateNumber){
        if(vechicleInfoList.containsKey(licencePlateNumber)){
            vechicleInfoList.remove(licencePlateNumber);
            System.out.println("Pojazd opuścił autostradę");
        }else {
            System.out.println("Brak pojazdu o wskazanym numerze rejestracyjnym");
        }
    }

    private double countPrice(VechicleInfo vechicle){
        return 0.0;
    }
}
