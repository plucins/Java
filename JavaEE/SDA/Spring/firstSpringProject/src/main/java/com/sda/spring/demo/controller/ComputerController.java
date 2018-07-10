package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Computer;
import com.sda.spring.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerController {

    @Autowired
    ComputerService computerService;

    @PostMapping(path = "/add")
    public ResponseEntity add(@RequestBody Computer computer) {
        boolean succes = computerService.addComputer(computer);
        if (!succes) {
            return ResponseEntity.badRequest().build();
        } else {

            return ResponseEntity.ok().build();

        }
    }

    @GetMapping(path = "/get")
    public ResponseEntity<List<Computer>> getComputers() {
        return ResponseEntity.ok(computerService.getComputerList());
    }

}
