package com.ceydog.rentcarlabackendcase.compensation.repository;

import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompensationRepository extends JpaRepository<Compensation, Long> {
    Page<Compensation> findAllByAgeRangeAndJobTitle(String ageRange, String jobTitle, Pageable pageable);
    Page<Compensation> findAllByAnnualSalaryAndJobTitle(String annualSalary, String jobTitle, Pageable pageable);


}
