package com.wecp.insurance_claims_processing_system.repository;


import com.wecp.insurance_claims_processing_system.entity.Policyholder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyholderRepository extends JpaRepository<Policyholder, Long> {
}
