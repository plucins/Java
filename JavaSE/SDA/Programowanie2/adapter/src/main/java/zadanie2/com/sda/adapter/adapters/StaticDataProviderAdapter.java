package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.IProviderAdapter;
import zadanie2.com.sda.adapter.provider3.Human;
import zadanie2.com.sda.adapter.provider3.StaticDataProvider;

import java.util.List;

public class StaticDataProviderAdapter implements IProviderAdapter {
    private StaticDataProvider staticDataProvider;

    public StaticDataProviderAdapter(StaticDataProvider staticDataProvider) {
        this.staticDataProvider = staticDataProvider;
    }

    @Override
    public List<IHumanable> getPersons() {
        for(Human h : staticDataProvider.getHumanList()){
            
        }
        return null;
    }
}
