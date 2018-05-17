package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.provider1.Person;

import java.time.LocalDate;

public class PersonAdapter implements IHumanable {
    private Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public int getID() {
        return person.getId();
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getSurname() {
        return person.getSurname();
    }

    @Override
    public String getSocialIdentifier() {
        return "";
    }

    @Override
    public String getPesel() {
        return person.getPesel();
    }

    @Override
    public LocalDate getBirthDate() {
        return person.getBirthDate();
    }
}
