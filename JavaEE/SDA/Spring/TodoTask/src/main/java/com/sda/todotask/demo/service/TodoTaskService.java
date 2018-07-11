package com.sda.todotask.demo.service;

import com.sda.todotask.demo.model.TaskState;
import com.sda.todotask.demo.model.TodoTask;
import com.sda.todotask.demo.model.dto.task.ChangeTaskStateDto;
import com.sda.todotask.demo.model.dto.task.CreateTodoTaskDto;
import com.sda.todotask.demo.model.dto.task.EditTodoTaskDto;
import com.sda.todotask.demo.model.dto.task.TasksFromPointedDateDto;
import com.sda.todotask.demo.repository.TodoTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TodoTaskService {

    @Autowired
    TodoTaskRepository todoTaskRepository;

    public TodoTask addTodoTask(CreateTodoTaskDto dto) {
        return todoTaskRepository.save(new TodoTask(dto.getTitle(), dto.getDescription(), LocalDateTime.now(), TaskState.NOT_ASSIGNED));
    }

    public Optional<TodoTask> editTodoTask(Long id, EditTodoTaskDto dto) {
        Optional<TodoTask> todoTask = todoTaskRepository.findById(id);

        if (todoTask.isPresent()) {
            todoTask.get().setDescription(dto.getDescription());
            return todoTask;
        }
        return Optional.empty();
    }

    public List<TodoTask> getAllTasks() {
        return todoTaskRepository.findAll();
    }

    public Optional<TodoTask> changeTaskState(Long id, ChangeTaskStateDto dto) {
        Optional<TodoTask> task = todoTaskRepository.findById(id);

        if (task.isPresent()) {
            task.get().setState(dto.getState());
            return task;
        }
        return Optional.empty();
    }

    public List<TodoTask> getTasksFromPointedDate(TasksFromPointedDateDto dto) {
       return getAllTasks().stream()
               .filter(u-> u.getAddedDate().toLocalDate().equals(dto.getAddedDate()))
               .collect(Collectors.toList());
    }
}
