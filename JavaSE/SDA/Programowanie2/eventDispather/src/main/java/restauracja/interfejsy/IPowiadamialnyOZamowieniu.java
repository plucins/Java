package restauracja.interfejsy;

import java.util.List;

public interface IPowiadamialnyOZamowieniu {
    void klientZlozylZamowienie(String imie, List<String> zamowienie);
}
