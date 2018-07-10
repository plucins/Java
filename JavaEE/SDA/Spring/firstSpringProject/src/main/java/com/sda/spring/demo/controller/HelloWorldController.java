package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Computer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> metoda(){
        return ResponseEntity.ok("Hello");
    }

    @GetMapping(path = "/new")
    public ResponseEntity<Computer> nowyKomputer(){
        return ResponseEntity.ok(new Computer(99,"Szybki","Dell","E5470",4300.1,56));
    }
}
