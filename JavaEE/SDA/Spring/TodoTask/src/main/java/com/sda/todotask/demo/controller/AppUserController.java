package com.sda.todotask.demo.controller;

import com.sda.todotask.demo.model.AppUser;
import com.sda.todotask.demo.model.dto.user.EditUserDetailsDto;
import com.sda.todotask.demo.model.dto.user.ListUserDto;
import com.sda.todotask.demo.model.dto.user.RegisterUserDto;
import com.sda.todotask.demo.service.AppUserService;
import com.sda.todotask.demo.model.dto.user.UnregisterUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody RegisterUserDto dto){
        appUserService.registerUser(dto);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<AppUser> editUser(@PathVariable(name = "id") Long id, @RequestBody EditUserDetailsDto dto){
       Optional<AppUser> editedAddUser =  appUserService.editUser(id,dto);
       if(editedAddUser.isPresent()){
           return ResponseEntity.ok(editedAddUser.get());
       }

       return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<ListUserDto>> ListUsers(){
       return ResponseEntity.ok(appUserService.getAllUsers());
    }

    @PostMapping(path = "/remove")
    public ResponseEntity removeUser(@RequestBody UnregisterUserDto dto){
        if(appUserService.removeUser(dto)){
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.badRequest().build();
    }
}
