package com.sda.service.model.dto.user;

public class ServiceUserComputerAssignDto {
    private Long userId;
    private Long computerId;

    public ServiceUserComputerAssignDto() {
    }

    public ServiceUserComputerAssignDto(Long userId, Long computerId) {
        this.userId = userId;
        this.computerId = computerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
    }
}
