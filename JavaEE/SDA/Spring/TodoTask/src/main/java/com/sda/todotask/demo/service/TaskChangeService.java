package com.sda.todotask.demo.service;

import com.sda.todotask.demo.model.TaskChange;
import com.sda.todotask.demo.repository.TaskChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskChangeService {


    private TaskChangeRepository taskChangeRepository;

    @Autowired
    public TaskChangeService(TaskChangeRepository taskChangeRepository) {
        this.taskChangeRepository = taskChangeRepository;
    }

    public List<TaskChange> getAllTasksChange() {
        return taskChangeRepository.findAll();
    }

    public void addTaskChangeToDB(TaskChange taskChange){
        taskChangeRepository.save(taskChange);
    }
}
