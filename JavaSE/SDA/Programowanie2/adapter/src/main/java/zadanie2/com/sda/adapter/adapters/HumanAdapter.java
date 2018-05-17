package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.provider3.Human;

import java.time.LocalDate;

public class HumanAdapter implements IHumanable {
    private Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public int getID() {
        return human.getId();
    }

    @Override
    public String getName() {
        return human.getName();
    }

    @Override
    public String getSurname() {
        return human.getSurname();
    }

    @Override
    public String getSocialIdentifier() {
        return "";
    }

    @Override
    public String getPesel() {
        return "";
    }

    @Override
    public LocalDate getBirthDate() {
        return LocalDate.of(1970,01,01);
    }
}
