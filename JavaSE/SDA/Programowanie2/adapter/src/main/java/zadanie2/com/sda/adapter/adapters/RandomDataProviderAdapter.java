package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.IProviderAdapter;
import zadanie2.com.sda.adapter.provider2.RandomDataProvider;
import zadanie2.com.sda.adapter.provider2.User;

import java.util.ArrayList;
import java.util.List;

public class RandomDataProviderAdapter implements IProviderAdapter {
    private RandomDataProvider randomDataProvider;

    public RandomDataProviderAdapter(RandomDataProvider randomDataProvider) {
        this.randomDataProvider = randomDataProvider;
    }

    @Override
    public List<IHumanable> getPersons() {
        List<IHumanable> list = new ArrayList<>();

        for(User u: randomDataProvider.getSystemUsersList()){
            list.add(new UserAdapter(u));
        }

        return list;
    }
}
