package com.sda.service.repository;

import com.sda.service.model.RepairCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairCaseRepository extends JpaRepository<RepairCase,Long> {
}
