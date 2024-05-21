package org.example.crm_spring.repository;

import org.example.crm_spring.entity.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo,Long> {
}
