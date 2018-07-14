package com.sda.service.controller;

import com.sda.service.model.RepairCase;
import com.sda.service.model.dto.repaircase.RepairCaseBasicInformationDao;
import com.sda.service.model.dto.repaircase.RepariCaseFormDao;
import com.sda.service.service.RepairCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "repair")
public class RepairCaseController {


    private RepairCaseService repairCaseService;

    @Autowired
    public RepairCaseController(RepairCaseService repairCaseService) {
        this.repairCaseService = repairCaseService;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<RepairCaseBasicInformationDao> registerRepairCase(@RequestBody RepariCaseFormDao dao){
        Optional<RepairCaseBasicInformationDao> rc = repairCaseService.registerRepairCase(dao);
        return rc.isPresent() ? ResponseEntity.ok(rc.get()) : ResponseEntity.badRequest().build();

    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<RepairCaseBasicInformationDao>> getAllRepairCases(){
        return ResponseEntity.ok(repairCaseService.getAllRepairCases());
    }

    @DeleteMapping(path = "/remove/{id}")
    public ResponseEntity removeRepairCase(@PathVariable Long id){
        return repairCaseService.removeRepairCase(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
