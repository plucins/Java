package com.sda.todotask.demo.repository;

import com.sda.todotask.demo.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TodoTaskRepository extends JpaRepository<TodoTask,Long> {
    List<TodoTask> findAllByAddedDateLike(LocalDate date);
}
