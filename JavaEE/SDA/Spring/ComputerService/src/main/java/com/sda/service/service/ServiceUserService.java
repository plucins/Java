package com.sda.service.service;

import com.sda.service.model.Computer;
import com.sda.service.model.ServiceUser;
import com.sda.service.model.dto.user.RegisterUserDto;
import com.sda.service.model.dto.user.ServiceUserComputerAssignDto;
import com.sda.service.model.dto.user.ServiceUserWithNoPasswordDto;
import com.sda.service.repository.ComputerRepository;
import com.sda.service.repository.ServiceUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceUserService {

    private ServiceUserRepository serviceUserRepository;
    private ComputerRepository computerRepository;

    @Autowired
    public ServiceUserService(ServiceUserRepository serviceUserRepository, ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
        this.serviceUserRepository = serviceUserRepository;
    }

    public ServiceUser registerUser(RegisterUserDto dto) {
        return serviceUserRepository.save(ServiceUser.registerUser(dto));
    }

    public List<ServiceUserWithNoPasswordDto> getAllUsers() {
        List<ServiceUser> users = serviceUserRepository.findAll();

        return users.stream().map(ServiceUserWithNoPasswordDto::createUser)
                .collect(Collectors.toList());
    }

    public Optional<ServiceUserWithNoPasswordDto> updateUser(ServiceUserWithNoPasswordDto dto) {
        Optional<ServiceUser> user = serviceUserRepository.findById(dto.getId());
        if (user.isPresent()) {
            ServiceUser serviceUser = user.get();
            serviceUser.setName(dto.getName());
            serviceUser.setLastName(dto.getLastName());
            serviceUser.setAddress(dto.getAddress());

            return Optional.of(ServiceUserWithNoPasswordDto
                    .createUser(serviceUserRepository.save(serviceUser)));
        }
        return Optional.empty();

    }

    public boolean removeServiceUser(Long id) {
        if (serviceUserRepository.findById(id).isPresent()) {
            serviceUserRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean assignComputerToUser(ServiceUserComputerAssignDto dto) {
        Optional<Computer> computer = computerRepository.findById(dto.getComputerId());
        Optional<ServiceUser> user = serviceUserRepository.findById(dto.getUserId());

        if (computer.isPresent() && user.isPresent()) {
            user.get().addComputer(computer.get());
            serviceUserRepository.save(user.get());
            return true;
        }
        return false;
    }

    public Optional<ServiceUserWithNoPasswordDto> getUserById(Long id){
        Optional<ServiceUser> userOptional = serviceUserRepository.findById(id);

        if(userOptional.isPresent()) {
            return Optional.of(ServiceUserWithNoPasswordDto.createUser(userOptional.get()));
        }
        return Optional.empty();
    }
}
