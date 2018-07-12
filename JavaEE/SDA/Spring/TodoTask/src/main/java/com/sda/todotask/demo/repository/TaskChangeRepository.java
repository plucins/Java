package com.sda.todotask.demo.repository;

import com.sda.todotask.demo.model.TaskChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskChangeRepository extends JpaRepository<TaskChange,Long> {
}
