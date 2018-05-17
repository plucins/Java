package zadanie2.com.sda.adapter;

import java.time.LocalDate;

public interface IHumanable {
    int getID();
    String getName();
    String getSurname();
    String getSocialIdentifier();
    String getPesel();
    LocalDate getBirthDate();

}