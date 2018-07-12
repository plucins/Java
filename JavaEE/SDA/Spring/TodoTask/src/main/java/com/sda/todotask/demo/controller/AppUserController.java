package com.sda.todotask.demo.controller;

import com.sda.todotask.demo.model.AppUser;
import com.sda.todotask.demo.model.dto.user.*;
import com.sda.todotask.demo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/user")
public class AppUserController {


    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody RegisterUserDto dto) {
        appUserService.registerUser(dto);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<UserWithNoPasswordDto> editUser(@PathVariable(name = "id") Long id, @RequestBody EditUserDetailsDto dto) {

        Optional<AppUser> editedAddUser = appUserService.editUser(id, dto);
        if (editedAddUser.isPresent()) {
            return ResponseEntity.ok(UserWithNoPasswordDto.creatUserWithNoPassword(editedAddUser.get()));
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<ListUserDto>> ListUsers() {
        return ResponseEntity.ok(appUserService.getAllUsers());
    }

    @PostMapping(path = "/remove")
    public ResponseEntity removeUser(@RequestBody UnregisterUserDto dto) {
        if (appUserService.removeUser(dto)) {
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "/assign")
    public ResponseEntity<UserWithNoPasswordDto> addTaskToUser(@RequestBody AddTaskToUser dto) {
        Optional<UserWithNoPasswordDto> user = appUserService.addTaskToUser(dto);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.badRequest().build();
    }
}
