package com.sda.service.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RepairCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createDate;
    private String description;
    @OneToOne
    @JoinColumn(name = "computer_id")
    private Computer computer;
    @OneToOne
    @JoinColumn(name = "serviceUser_id")
    private ServiceUser user;

    public RepairCase() {
    }

    public RepairCase(LocalDateTime createDate, String description, Computer computer, ServiceUser user) {
        this.createDate = createDate;
        this.description = description;
        this.computer = computer;
        this.user = user;
    }

    public RepairCase(String description, Computer computer, ServiceUser user) {
        this.createDate = LocalDateTime.now();
        this.description = description;
        this.computer = computer;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public ServiceUser getUser() {
        return user;
    }

    public void setUser(ServiceUser user) {
        this.user = user;
    }
}
