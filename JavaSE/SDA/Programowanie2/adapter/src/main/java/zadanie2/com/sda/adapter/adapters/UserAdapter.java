package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.provider2.User;

import java.time.LocalDate;

public class UserAdapter implements IHumanable {
    private User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public int getID() {
        return user.getIdentifier();
    }

    @Override
    public String getName() {
        return user.getNameAndSurname();
    }

    @Override
    public String getSurname() {
        return "";
    }

    @Override
    public String getSocialIdentifier() {
        return user.getSocialIdentifier();
    }

    @Override
    public String getPesel() {
        return "";
    }

    @Override
    public LocalDate getBirthDate() {
        return user.getBirthDate();
    }
}
