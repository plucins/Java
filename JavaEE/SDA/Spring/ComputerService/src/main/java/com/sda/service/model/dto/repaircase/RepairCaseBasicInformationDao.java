package com.sda.service.model.dto.repaircase;

import com.sda.service.model.Computer;
import com.sda.service.model.RepairCase;
import com.sda.service.model.dto.user.ServiceUserBasicInformation;

import java.time.LocalDateTime;

public class RepairCaseBasicInformationDao {

    private Long id;
    private LocalDateTime createDate;
    private String description;
    private Computer computer;
    private ServiceUserBasicInformation computerOwner;

    public RepairCaseBasicInformationDao() {
    }

    public RepairCaseBasicInformationDao(Long id, LocalDateTime createDate, String description, Computer computer, ServiceUserBasicInformation computerOwner) {
        this.id = id;
        this.createDate = createDate;
        this.description = description;
        this.computer = computer;
        this.computerOwner = computerOwner;
    }

    public static RepairCaseBasicInformationDao basicInformation(RepairCase repairCase) {
        return  new RepairCaseBasicInformationDao(repairCase.getId(),repairCase.getCreateDate(),repairCase.getDescription(),
                repairCase.getComputer(),ServiceUserBasicInformation.createUser(repairCase.getUser()));
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

    public ServiceUserBasicInformation getComputerOwner() {
        return computerOwner;
    }

    public void setComputerOwner(ServiceUserBasicInformation computerOwner) {
        this.computerOwner = computerOwner;
    }
}
