package com.sda.service.model.dto.repaircase;

public class RepairCaseUpdate {

    private Long id;
    private String description;


    public RepairCaseUpdate() {
    }

    public RepairCaseUpdate(String description) {
        this.description = description;
    }

    public RepairCaseUpdate(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
