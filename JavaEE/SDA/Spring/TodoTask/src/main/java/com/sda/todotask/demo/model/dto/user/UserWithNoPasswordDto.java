package com.sda.todotask.demo.model.dto.user;

import com.sda.todotask.demo.model.AppUser;
import com.sda.todotask.demo.model.TodoTask;

import java.util.ArrayList;
import java.util.List;

public class UserWithNoPasswordDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String adress;
    private List<TodoTask> tasks = new ArrayList<>();


    public UserWithNoPasswordDto() {
    }

    public UserWithNoPasswordDto(Long id, String email,String firstName, String lastName, String adress, List<TodoTask> tasks) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.tasks = tasks;
    }

    public static UserWithNoPasswordDto creatUserWithNoPassword(AppUser appUser) {
        return new UserWithNoPasswordDto(appUser.getId(),appUser.getEmail(),appUser.getFirstName(),appUser.getLastName(),appUser.getAdress(),appUser.getTaskList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<TodoTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<TodoTask> tasks) {
        this.tasks = tasks;
    }
}
