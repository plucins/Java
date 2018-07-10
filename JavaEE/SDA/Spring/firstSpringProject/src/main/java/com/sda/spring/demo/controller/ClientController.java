package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Client;
import com.sda.spring.demo.service.ClientService;
import com.sda.spring.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;


    @GetMapping(path = "/getAll")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getClientList());
    }

    @PostMapping(path = "/add")
    public ResponseEntity addClient(@RequestBody Client client) {
        if (clientService.addClient(client)) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(path = "/remove")
    public ResponseEntity deleteClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.removeClient(client));
    }

    @PutMapping(path = "/update/{clientId}")
    public ResponseEntity updateClient(@PathVariable("clientId") String clientId, @RequestBody Client client) {
        if (clientService.updateClient(clientId, client)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.noContent().build();
    }

}
