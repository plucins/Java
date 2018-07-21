package com.sda.saleboard.repository;

import com.sda.saleboard.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Long> {
    List<Policy> findAllByCreatedDateAfterAndSellerEmail(LocalDateTime date, String email);
}
