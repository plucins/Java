package service;

import fields.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slawo on 06.12.2017.
 */
public class UserController {

    private static List<User> users = new ArrayList<>();


    public static List<User> initUserList(){
        users.add(new User("kowal12","123123",createFirstPerson()));
        users.add(new User("Aodawacz22","98521",createSecondPerson()));
        users.add(new User("Beni0","asdzxcwe",createThirdPerson()));
        users.add(new User("K0z4k","111222",createFourthPerson()));
        users.add(new User("A3L0n","qwerty",createFifthPerson()));

        return users;
    }

    public static Person createFirstPerson(){
        List<String> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Permission> permissions = new ArrayList<>();


        Address address1 = new Address("1 Listopada", 23,1,"Gdańsk","80-180",
                "Polska");
        Address address2 = new Address("Grunwaldzka", 1,23,"Sopot","00-180",
                "Polska");

        Permission permission1 = new Permission("Dodawanie użytkowników");
        Permission permission2 = new Permission("Modyfikacja użytkowników");

        addresses.add(address1);
        addresses.add(address2);
        phoneNumbers.add("78945613");
        phoneNumbers.add("123456789");
        permissions.add(permission1);
        permissions.add(permission2);

        Role role = new Role("Admin",permissions);

        Person person = new Person("Janusz","Sankowski", phoneNumbers,addresses, role, 98);

        return person;
    }

    private static Person createSecondPerson(){
        List<String> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Permission> permissions = new ArrayList<>();


        Address address1 = new Address("Randomowa", 1,0,"Radom","14-111",
                "Polska");

        Permission permission1 = new Permission("Kopiowanie");
        Permission permission2 = new Permission("Modyfikacja");

        addresses.add(address1);
        phoneNumbers.add("65479321");
        permissions.add(permission1);
        permissions.add(permission2);

        Role role = new Role("Dodawacz",permissions);

        Person person = new Person("Mariusz","Sariuszowski", phoneNumbers,addresses, role, 99);

        return person;
    }

    private static Person createThirdPerson(){
        List<String> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Permission> permissions = new ArrayList<>();


        Address address1 = new Address("Kowalowa", 12,3,"Kowale","23-151",
                "Polska");
        Address address2 = new Address("Gdańska", 14,2,"Gdańsk","10-571",
                "Polska");
        Address address3 = new Address("Sopocka", 3,15,"Sopot","66-521",
                "Polska");

        Permission permission1 = new Permission("Dodawanie");
        Permission permission2 = new Permission("Odejmowanie");
        Permission permission3 = new Permission("Mnożenie");
        Permission permission4 = new Permission("Dzielenie");

        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        phoneNumbers.add("852147963");
        phoneNumbers.add("254799621");
        phoneNumbers.add("654789631");
        permissions.add(permission1);
        permissions.add(permission2);
        permissions.add(permission3);
        permissions.add(permission4);

        Role role = new Role("Matematyk",permissions);

        Person person = new Person("Dariusz","Dariuszowski", phoneNumbers,addresses, role, 12);

        return person;
    }

    private static Person createFourthPerson(){
        List<String> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Permission> permissions = new ArrayList<>();


        Address address1 = new Address("Kraków", 5,6,"Krakowska","37-661",
                "Polska");
        Address address2 = new Address("Krakowska", 1,1,"Kraków","00-001",
                "Polska");


        Permission permission1 = new Permission("Bieganie");
        Permission permission2 = new Permission("Strzelanie");
        Permission permission3 = new Permission("Kucanie");


        addresses.add(address1);
        addresses.add(address2);
        phoneNumbers.add("669874221");
        phoneNumbers.add("553114786");
        phoneNumbers.add("776852147");
        permissions.add(permission1);
        permissions.add(permission2);
        permissions.add(permission3);

        Role role = new Role("Gracz",permissions);

        Person person = new Person("Adam","Adamowski", phoneNumbers,addresses, role, 17);

        return person;
    }

    private static Person createFifthPerson(){
        List<String> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Permission> permissions = new ArrayList<>();


        Address address1 = new Address("Kraków", 5,6,"Krakowska","37-661",
                "Polska");


        Permission permission1 = new Permission("Kompilowanie");
        Permission permission2 = new Permission("Debugowanie");
        Permission permission3 = new Permission("Dziedziczenie");


        addresses.add(address1);
        phoneNumbers.add("669874221");
        phoneNumbers.add("553114786");
        phoneNumbers.add("776852147");
        permissions.add(permission1);
        permissions.add(permission2);
        permissions.add(permission3);

        Role role = new Role("Informatyk",permissions);

        Person person = new Person("Adam","Adamowski", phoneNumbers,addresses, role, 21);

        return person;
    }
}

