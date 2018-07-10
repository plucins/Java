package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Computer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ComputerService {
    private Map<Integer,Computer> computerList = new HashMap<>();

    public boolean addComputer(Computer c){
        c.setId(computerList.size() + 1);
        if(c.getModel() == null || c.getModel().isEmpty()){
            return false;
        }else {
            computerList.put(c.getId(), c);
            return true;
        }
    }

    public List<Computer> getComputerList(){
        return new ArrayList<>(computerList.values());
    }

    public Computer getComputer(int id){
        return computerList.get(id);
    }
}
