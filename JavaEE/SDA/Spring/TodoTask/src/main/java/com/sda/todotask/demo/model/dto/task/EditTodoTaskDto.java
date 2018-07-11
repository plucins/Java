package com.sda.todotask.demo.model.dto.task;

public class EditTodoTaskDto {
    private String description;

    public EditTodoTaskDto() {
    }

    public EditTodoTaskDto(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
