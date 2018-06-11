import dao.CarDAO;
import dao.PersonDAO;
import model.Car;
import model.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class run {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Model");
        car.setBrand("Brand");
        car.setProductionDate(LocalDate.now());
        PersonDAO personDAO = new PersonDAO();
        CarDAO carDAO = new CarDAO();

        Person person = new Person();
        person.setName("Imie");
        person.setSurname("Nazwisko");


        Car car1 = new Car();
        car1.setBrand("Aaa");
        car1.setPerson(person);

        car.setPerson(person);


        personDAO.add(person);
        carDAO.add(car);
        carDAO.add(car1);

        System.out.println(carDAO.findAll());
    }
}
