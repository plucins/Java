package zadanie2.com.sda.adapter.adapters;

import zadanie2.com.sda.adapter.IHumanable;
import zadanie2.com.sda.adapter.IProviderAdapter;
import zadanie2.com.sda.adapter.provider1.FileDataProvider;
import zadanie2.com.sda.adapter.provider1.Person;

import java.util.ArrayList;
import java.util.List;

public class FileDataProviderAdapter implements IProviderAdapter {
    FileDataProvider fileDataProvider;

    public FileDataProviderAdapter(FileDataProvider fileDataProvider) {
        this.fileDataProvider = fileDataProvider;
    }

    @Override
    public List<IHumanable> getPersons() {
        List<IHumanable> list = new ArrayList<>();

        for(Person p: fileDataProvider.getPeopleList()){
            list.add(new PersonAdapter(p));
        }
        return list;
    }
}
