package Zadanie7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private boolean isMale;

    public Person(String name, String lastName, int age, boolean isMale) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public List<Person> onlyManList(List<Person> persons){
        return persons.stream().
                filter(u -> u.isMale).
                collect(Collectors.toList());
    }

    public List<Person> adultsFamaleList(List<Person> persons){
        return persons.stream().filter( u -> !u.isMale())
                .filter(p->p.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public Optional<Person> optionalAdultJack(List<Person> persons){
        return persons.stream()
                .filter(u->u.getAge() >= 18)
                .filter(u-> u.getName().equals("Jacek"))
                .findFirst();
    }

    public List<String> getPersonsYoungerThan19AndOlderThan15(List<Zadanie6.Person> persoons){
        return persoons.stream().filter(u -> u.getAge() > 14 && u.getAge() < 20)
                .map(u -> u.getLastName())
                .collect(Collectors.toList());
    }

    public int getSumAllPersonsAge(List<Zadanie6.Person> persons){
        return persons.stream().mapToInt(Zadanie6.Person::getAge).sum();
    }

    public double getAvaragePersonsAge(List<Zadanie6.Person> persons){
        return persons.stream().collect(Collectors.averagingInt(u -> u.getAge()));
    }

    public Zadanie6.Person getOldestPerson(List<Zadanie6.Person> persons){
        return persons.stream().max(Comparator.comparingInt(Zadanie6.Person::getAge)).get();
    }
}
