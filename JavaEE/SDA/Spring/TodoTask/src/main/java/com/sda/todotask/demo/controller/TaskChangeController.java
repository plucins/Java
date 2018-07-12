package com.sda.todotask.demo.controller;

import com.sda.todotask.demo.model.TaskChange;
import com.sda.todotask.demo.repository.TaskChangeRepository;
import com.sda.todotask.demo.service.TaskChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/taskchange")
public class TaskChangeController {

    private TaskChangeService taskChangeService;

    @Autowired
    public TaskChangeController(TaskChangeService taskChangeService) {
        this.taskChangeService = taskChangeService;
    }

    @GetMapping("/list")
    public List<TaskChange> getAllTasksChange(){
        return taskChangeService.getAllTasksChange();
    }


}
