package zadanie2.com.sda.adapter;

import zadanie2.com.sda.adapter.adapters.HumanAdapter;
import zadanie2.com.sda.adapter.adapters.PersonAdapter;
import zadanie2.com.sda.adapter.adapters.UserAdapter;
import zadanie2.com.sda.adapter.provider1.FileDataProvider;
import zadanie2.com.sda.adapter.provider1.Person;
import zadanie2.com.sda.adapter.provider2.RandomDataProvider;
import zadanie2.com.sda.adapter.provider2.User;
import zadanie2.com.sda.adapter.provider3.Human;
import zadanie2.com.sda.adapter.provider3.StaticDataProvider;

import java.util.ArrayList;
import java.util.List;

public class PeopleRegistry {

    List<IHumanable> getPersons(){
        List<IHumanable> list = new ArrayList<>();
        List<Person> persons = new FileDataProvider().getPeopleList();
        List<Human> humans = new StaticDataProvider().getHumanList();
        List<User> users = new RandomDataProvider().getSystemUsersList();
        for(int i = 0; i < persons.size(); i++){
            list.add(new PersonAdapter(persons.get(i)));
        }

        for(int i = 0; i < humans.size(); i++){
            list.add(new HumanAdapter(humans.get(i)));
        }

        for(int i = 0; i < users.size(); i++){
            list.add(new UserAdapter(users.get(i)));
        }

        return list;
    }

    public void getId(){
        List<IHumanable> list = getPersons();
        for(IHumanable hum: list){
            System.out.print("ID: " +hum.getID() + " ");
            System.out.print("Imie: " + hum.getName() + " ");
            System.out.print("Nazwisko: " +hum.getSurname() + " ");
            System.out.print("Pesel: " + hum.getPesel() + " ");
            System.out.print("BirthDate: " + hum.getBirthDate() + " ");
            System.out.print("SocialIdentifier: " + hum.getSocialIdentifier() + " ");

            System.out.println();
        }
    }
}
