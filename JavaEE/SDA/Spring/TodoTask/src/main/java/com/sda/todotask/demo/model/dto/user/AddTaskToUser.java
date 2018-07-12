package com.sda.todotask.demo.model.dto.user;

public class AddTaskToUser {
    private String userEmail;
    private Long taskId;

    public AddTaskToUser() {
    }

    public AddTaskToUser(String userEmail, Long taskId) {
        this.userEmail = userEmail;
        this.taskId = taskId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}
