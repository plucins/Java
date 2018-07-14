package com.sda.service.service;

import com.sda.service.model.Computer;
import com.sda.service.model.dto.computer.RegisterComputerDto;
import com.sda.service.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    private ComputerRepository computerRepository;

    @Autowired
    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public Computer registerComputer(RegisterComputerDto dto) {
        return computerRepository.save(Computer.createComputer(dto));
    }

    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    public Optional<Computer> updateComputer(Computer computer) {
        Optional<Computer> computerOptional = computerRepository.findById(computer.getId());

        if(computerOptional.isPresent()){
            computerOptional.get().setName(computer.getName());
            computerOptional.get().setDescription(computer.getDescription());
            return Optional.of(computerRepository.save(computerOptional.get()));
        }
        return Optional.empty();
    }

    public boolean removeComputer(Long id) {
        if(computerRepository.findById(id).isPresent()){
            computerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
