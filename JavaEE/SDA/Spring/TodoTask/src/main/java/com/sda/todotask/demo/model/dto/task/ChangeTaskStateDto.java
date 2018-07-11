package com.sda.todotask.demo.model.dto.task;

import com.sda.todotask.demo.model.TaskState;

public class ChangeTaskStateDto {
    private TaskState state;

    public ChangeTaskStateDto() {
    }

    public ChangeTaskStateDto(TaskState state) {
        this.state = state;
    }

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }
}
