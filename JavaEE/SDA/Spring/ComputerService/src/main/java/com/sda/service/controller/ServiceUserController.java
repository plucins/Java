package com.sda.service.controller;

import com.sda.service.model.ServiceUser;
import com.sda.service.model.dto.user.RegisterUserDto;
import com.sda.service.model.dto.user.ServiceUserComputerAssignDto;
import com.sda.service.model.dto.user.ServiceUserWithNoPasswordDto;
import com.sda.service.service.ServiceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class ServiceUserController {

    private ServiceUserService serviceUserService;

    @Autowired
    public ServiceUserController(ServiceUserService serviceUserService) {
        this.serviceUserService = serviceUserService;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<ServiceUser> registerUser(@RequestBody RegisterUserDto dto){
        ServiceUser user = serviceUserService.registerUser(dto);
        return ResponseEntity.ok(user);
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<ServiceUserWithNoPasswordDto>> getUsersList(){
        return ResponseEntity.ok(serviceUserService.getAllUsers());
    }

    @PutMapping(path = "/update")
    public ResponseEntity<ServiceUserWithNoPasswordDto> updateUser(@RequestBody ServiceUserWithNoPasswordDto dto ){
        Optional<ServiceUserWithNoPasswordDto> user = serviceUserService.updateUser(dto);

        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/remove/{id}")
    public ResponseEntity removeServiceUser(@PathVariable Long id){
        return serviceUserService.removeServiceUser(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "/assign")
    public ResponseEntity<ServiceUserWithNoPasswordDto> assignComputerToUser(@RequestBody ServiceUserComputerAssignDto dto){
        if(serviceUserService.assignComputerToUser(dto)){
            return ResponseEntity.ok(serviceUserService.getUserById(dto.getUserId()).get());
        }

        return ResponseEntity.badRequest().build();
    }

    
}
