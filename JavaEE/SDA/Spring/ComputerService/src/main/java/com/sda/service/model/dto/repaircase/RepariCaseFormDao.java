package com.sda.service.model.dto.repaircase;

public class RepariCaseFormDao {

    private String description;
    private Long computerId;
    private Long userId;

    public RepariCaseFormDao() {
    }

    public RepariCaseFormDao(String description, Long computerId, Long userId) {
        this.description = description;
        this.computerId = computerId;
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
