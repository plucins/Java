package com.sda.service.service;

import com.sda.service.model.Computer;
import com.sda.service.model.RepairCase;
import com.sda.service.model.ServiceUser;
import com.sda.service.model.dto.repaircase.RepairCaseBasicInformationDao;
import com.sda.service.model.dto.repaircase.RepariCaseFormDao;
import com.sda.service.repository.ComputerRepository;
import com.sda.service.repository.RepairCaseRepository;
import com.sda.service.repository.ServiceUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairCaseService {

    private ServiceUserRepository serviceUserRepository;
    private ComputerRepository computerRepository;
    private RepairCaseRepository repairCaseRepository;

    @Autowired
    public RepairCaseService(ServiceUserRepository serviceUserRepository, ComputerRepository computerRepository, RepairCaseRepository repairCaseRepository) {
        this.serviceUserRepository = serviceUserRepository;
        this.computerRepository = computerRepository;
        this.repairCaseRepository = repairCaseRepository;
    }

    public Optional<RepairCaseBasicInformationDao> registerRepairCase(RepariCaseFormDao dao) {
        Optional<Computer> computer = computerRepository.findById(dao.getComputerId());
        Optional<ServiceUser> user = serviceUserRepository.findById(dao.getUserId());

        if(computer.isPresent() && user.isPresent()){
            RepairCase rc = new RepairCase(dao.getDescription(),computer.get(), user.get());
            repairCaseRepository.save(rc);
            return Optional.of(RepairCaseBasicInformationDao.basicInformation(rc));
        }
        return Optional.empty();
    }

    public List<RepairCaseBasicInformationDao> getAllRepairCases() {
        List<RepairCase> repairCases = repairCaseRepository.findAll();
        return repairCases.stream().map(RepairCaseBasicInformationDao::basicInformation)
                .collect(Collectors.toList());
    }

    public boolean removeRepairCase(Long id) {
        if(repairCaseRepository.findById(id).isPresent()){
            repairCaseRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
