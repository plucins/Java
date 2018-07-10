package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private List<Client> clientList = new ArrayList<>();


    public boolean addClient(Client client) {
        String pointedBirthYear = client.getPesel().substring(0, 2);
        String pointedBirthMonth = client.getPesel().substring(3, 4);

        if (pointedBirthMonth.equals(String.valueOf(client.getBirthMonth())) && pointedBirthYear.equals(String.valueOf(client.getBirthYear() - 1900))) {
            return clientList.add(client);
        }
        return false;
    }

    public boolean removeClient(Client client) {
        Client foundedClient = null;
        for (Client c : clientList) {
            if (c.getPesel().equals(client.getPesel())) {
                foundedClient = c;
            }
        }
        return clientList.remove(foundedClient);
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public boolean updateClient(String pesel, Client client) {
        for (Client c : clientList) {
            if (c.getPesel().equals(pesel)) {
                clientList.remove(c);
                clientList.add(client);
                return true;
            }
        }
        return false;
    }
}
