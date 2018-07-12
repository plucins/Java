package com.sda.todotask.demo.service;

import com.sda.todotask.demo.model.AppUser;
import com.sda.todotask.demo.model.TaskChange;
import com.sda.todotask.demo.model.TaskState;
import com.sda.todotask.demo.model.TodoTask;
import com.sda.todotask.demo.model.dto.user.*;
import com.sda.todotask.demo.repository.AppUserRepository;
import com.sda.todotask.demo.repository.TodoTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppUserService {


    private AppUserRepository appUserRepository;
    private TodoTaskRepository todoTaskRepository;
    private TaskChangeService taskChangeService;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository, TodoTaskRepository todoTaskRepository,TaskChangeService taskChangeService) {
        this.todoTaskRepository = todoTaskRepository;
        this.appUserRepository = appUserRepository;
        this.taskChangeService = taskChangeService;

    }

    public void registerUser(RegisterUserDto dto) {
        appUserRepository.save(new AppUser(dto.getRegisterEmail(), dto.getRegisterPassword()));
    }

    public Optional<AppUser> editUser(Long id, EditUserDetailsDto dto) {
        Optional<AppUser> searchedUser = appUserRepository.findById(id);

        if (searchedUser.isPresent()) {
            AppUser user = searchedUser.get();
            taskChangeService.addTaskChangeToDB(new TaskChange("User " + user.getFirstName() + " " +
                    user.getLastName() + " " + user.getAdress() + " -> " + dto.getFirstName() +
                    " " +dto.getLastName() + " " + dto.getAdress() + " changed"));
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
        if (user.isPresent() && user.get().getEmail().equals(dto.getEmail()) && user.get().getPassword().equals(dto.getPassword())) {
            taskChangeService.addTaskChangeToDB(new TaskChange("User " + user.get().getFirstName() + " " + user.get().getLastName() + " deleted"));
            appUserRepository.delete(user.get());
            return true;
        }

        return false;
    }

    public Optional<UserWithNoPasswordDto> addTaskToUser(AddTaskToUser dto) {
        Optional<AppUser> user = appUserRepository.findByEmail(dto.getUserEmail());
        Optional<TodoTask> task = todoTaskRepository.findById(dto.getTaskId());
        if (user.isPresent() && task.isPresent()) {
            AppUser appUser = user.get();
            TodoTask todoTask = task.get();

            taskChangeService.addTaskChangeToDB(new TaskChange("State Change " +todoTask.getState() + " -> " + TaskState.ASSIGNED + " for user " + appUser.getEmail()));
            todoTask.setState(TaskState.ASSIGNED);
            appUser.getTaskList().add(todoTask);
            appUserRepository.save(appUser);

            return Optional.of(UserWithNoPasswordDto.creatUserWithNoPassword(appUser));
        }

        return Optional.empty();
    }
}
