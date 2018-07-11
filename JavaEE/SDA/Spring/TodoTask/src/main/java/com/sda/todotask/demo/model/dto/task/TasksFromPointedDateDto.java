package com.sda.todotask.demo.model.dto.task;

import java.time.LocalDate;

public class TasksFromPointedDateDto {
    LocalDate addedDate;

    public TasksFromPointedDateDto() {
    }

    public TasksFromPointedDateDto(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }
}
