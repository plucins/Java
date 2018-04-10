package struktury.dziennikSzkolny;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OcenyStudenta {

    private Map<Przedmiot,List<Double>> ocenyStudenta = new HashMap<>();


    public Map<Przedmiot, List<Double>> getOcenyStudenta() {
        return ocenyStudenta;
    }

    public void setOcenyStudenta(Map<Przedmiot, List<Double>> ocenyStudenta) {
        this.ocenyStudenta = ocenyStudenta;
    }
}
