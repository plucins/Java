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
    private long level;
    private long expTotalEarned;
    private long expToNextLevel;

    public Experience() {
        this.level = 1;
        this.expToNextLevel = 1000;
        this.expTotalEarned = 0;
    }

    public Experience(Long level, Long expTotalEarned, Long expToNextLevel) {
        this.level = level;
        this.expTotalEarned = expTotalEarned;
        this.expToNextLevel = expToNextLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public long getExpTotalEarned() {
        return expTotalEarned;
    }

    public void setExpTotalEarned(long expTotalEarned) {
        this.expTotalEarned = expTotalEarned;
    }

    public long getExpToNextLevel() {
        return expToNextLevel;
    }

    public void setExpToNextLevel(long expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }
}
