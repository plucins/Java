package com.sda.todotask.demo.controller;

import com.sda.todotask.demo.model.TodoTask;
import com.sda.todotask.demo.model.dto.task.ChangeTaskStateDto;
import com.sda.todotask.demo.model.dto.task.CreateTodoTaskDto;
import com.sda.todotask.demo.model.dto.task.EditTodoTaskDto;
import com.sda.todotask.demo.model.dto.task.TasksFromPointedDateDto;
import com.sda.todotask.demo.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "task")
public class TodoTaskController {

    @Autowired
    TodoTaskService todoTaskService;

    @PostMapping(path = "/add")
    public ResponseEntity createTask(@RequestBody CreateTodoTaskDto dto){
        return ResponseEntity.ok(todoTaskService.addTodoTask(dto));
    }

    @PostMapping(path = "/edit/{id}")
    public ResponseEntity createTask(@PathVariable(name = "id") Long id, @RequestBody EditTodoTaskDto dto){
        Optional<TodoTask> editedTask = todoTaskService.editTodoTask(id, dto);
        if(editedTask.isPresent()){
            return ResponseEntity.ok(editedTask.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/list")
    public List<TodoTask> getAllTasks(){
        return todoTaskService.getAllTasks();
    }

    @PostMapping(path = "/mark/{id}")
    public ResponseEntity<TodoTask> changeTaskState(@PathVariable(name = "id") Long id, @RequestBody ChangeTaskStateDto dto){
        Optional<TodoTask> updatedTask = todoTaskService.changeTaskState(id, dto);
        if(updatedTask.isPresent()){
            return ResponseEntity.ok(updatedTask.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "/list")
    public ResponseEntity<List<TodoTask>> getTasksFromPointedDate(@RequestBody TasksFromPointedDateDto dto){
        return ResponseEntity.ok(todoTaskService.getTasksFromPointedDate(dto));
    }

}
