package Zadanie6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public Person(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    public List<Person> getMale(List<Person> persons){
        return persons.stream().filter(u -> u.isMale()).collect(Collectors.toList());
    }

    public List<Person> getAdultWomans(List<Person> persons){
        return persons.stream().filter(u -> !u.isMale).filter(u -> u.getAge() > 18).collect(Collectors.toList());
    }

    public Optional<Person> getAdultJacek(List<Person> persons){
        return persons.stream().filter(u -> u.getFirstName().equals("Jacek")).filter(u -> u.getAge() > 18).findFirst();
    }

    public List<String> getPersonsYoungerThan19AndOlderThan15(List<Person> persoons){
        return persoons.stream().filter(u -> u.getAge() > 14 && u.getAge() < 20)
                    .map(u -> u.getLastName())
                    .collect(Collectors.toList());
    }

    public int getSumAllPersonsAge(List<Person> persons){
        return persons.stream().mapToInt(Person::getAge).sum();
    }

    public double getAvaragePersonsAge(List<Person> persons){
        return persons.stream().collect(Collectors.averagingInt(u -> u.getAge()));
    }

    public Person getOldestPerson(List<Person> persons){
        return persons.stream().max(Comparator.comparingInt(Person::getAge)).get();
    }
}
