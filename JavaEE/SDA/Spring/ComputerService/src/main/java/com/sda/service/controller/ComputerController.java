package com.sda.service.controller;

import com.sda.service.model.Computer;
import com.sda.service.model.dto.computer.RegisterComputerDto;
import com.sda.service.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/computer")
public class ComputerController {

    private ComputerService computerService;

    @Autowired
    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<Computer> registerComputer(@RequestBody RegisterComputerDto dto) {
        return ResponseEntity.ok(computerService.registerComputer(dto));
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<Computer>> getAllComputers() {
        return ResponseEntity.ok(computerService.getAllComputers());
    }

    @PutMapping(path = "/update")
    public ResponseEntity<Computer> updateComputer(@RequestBody Computer dto) {
        Optional<Computer> computerDto = computerService.updateComputer(dto);

        if (computerDto.isPresent()) {
            return ResponseEntity.ok(computerDto.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(path = "/remove/{id}")
    public ResponseEntity removeComputer(@PathVariable Long id){
        return computerService.removeComputer(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }



}
