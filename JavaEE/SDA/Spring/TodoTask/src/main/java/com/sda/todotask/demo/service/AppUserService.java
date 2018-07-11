package com.sda.todotask.demo.service;

import com.sda.todotask.demo.model.AppUser;
import com.sda.todotask.demo.model.dto.user.EditUserDetailsDto;
import com.sda.todotask.demo.model.dto.user.ListUserDto;
import com.sda.todotask.demo.model.dto.user.RegisterUserDto;
import com.sda.todotask.demo.model.dto.user.UnregisterUserDto;
import com.sda.todotask.demo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;


    public void registerUser(RegisterUserDto dto) {
        appUserRepository.save(new AppUser(dto.getRegisterEmail(), dto.getRegisterPassword()));
    }

    public Optional<AppUser> editUser(Long id, EditUserDetailsDto dto) {
        Optional<AppUser> searchedUser = appUserRepository.findById(id);

        if (searchedUser.isPresent()) {
            AppUser user = searchedUser.get();
            user.setAdress(dto.getAdress());
            user.setFirstName(dto.getFirstName());
            user.setLastName(dto.getLastName());
            user = appUserRepository.save(user);

            return Optional.of(user);
        }
        return Optional.empty();
    }

    public List<ListUserDto> getAllUsers() {
        List<AppUser> users = appUserRepository.findAll();
        return users.stream().map(ListUserDto::createDto).collect(Collectors.toList());
    }

    public boolean removeUser(UnregisterUserDto dto) {
        Optional<AppUser> user = appUserRepository.findById(dto.getUserId());
        if(user.isPresent() && user.get().getEmail().equals(dto.getEmail()) && user.get().getPassword().equals(dto.getPassword())){
            appUserRepository.delete(user.get());
            return true;
        }

        return false;
    }
}
