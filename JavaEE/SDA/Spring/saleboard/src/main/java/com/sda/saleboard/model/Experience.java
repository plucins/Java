package com.sda.saleboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long level;
    private Long expErned;
    private Long expToNextLevel;

    public Experience() {
    }

    public Experience(Long level, Long expErned, Long expToNextLevel) {
        this.level = level;
        this.expErned = expErned;
        this.expToNextLevel = expToNextLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getExpErned() {
        return expErned;
    }

    public void setExpErned(Long expErned) {
        this.expErned = expErned;
    }

    public Long getExpToNextLevel() {
        return expToNextLevel;
    }

    public void setExpToNextLevel(Long expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }
}
