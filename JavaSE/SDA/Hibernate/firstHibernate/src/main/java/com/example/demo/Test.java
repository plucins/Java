package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
public class Test {

    @Autowired
    CarRepo carRepo;

    @Autowired
    PeopleRepo peopleRepo;

    @GetMapping(value = "/hello")
    public void addCard() {
        Car car = new Car("Toyota", "Yaris", 1.2, LocalDate.of(1993, 07, 01), 412);
        Car car1 = new Car("Fiat", "126", 0.4, LocalDate.of(1993, 05, 01), 212);
        Car car2 = new Car("Peugeot", "206", 1.9, LocalDate.of(1993, 10, 01), 122);
        Car car3 = new Car("Fiat", "123", 1.7, LocalDate.of(1993, 11, 01), 126);
        Car car4 = new Car("Mazda", "6", 1.4, LocalDate.of(1993, 12, 01), 112);

        carRepo.save(car);
        carRepo.save(car1);
        carRepo.save(car2);
        carRepo.save(car3);
        carRepo.save(car4);
    }

    @GetMapping(value = "addPerson", params = {"type"})
    public void addPerson(@RequestParam(value = "type") String type) {
        Person p = new Person("Adam", "Adamowicz");

        if (type.equals("jdbc")) {
            new JdbcAdder().addPerson(p);
        }else {
            peopleRepo.save(p);
        }

    }
}
