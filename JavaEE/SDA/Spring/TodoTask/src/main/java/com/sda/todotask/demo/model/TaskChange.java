package com.sda.todotask.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TaskChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime changeDate;
    private String changedescription;

    public TaskChange() {
    }

    public TaskChange(LocalDateTime changeDate, String changedescription) {
        this.changeDate = changeDate;
        this.changedescription = changedescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    public String getChangedescription() {
        return changedescription;
    }

    public void setChangedescription(String changedescription) {
        this.changedescription = changedescription;
    }
}
