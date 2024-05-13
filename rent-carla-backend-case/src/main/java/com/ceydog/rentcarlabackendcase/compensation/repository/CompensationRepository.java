package com.ceydog.rentcarlabackendcase.compensation.repository;

import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompensationRepository extends JpaRepository<Compensation, Long> {

    Compensation findCompensationByIndustryAndLocation(String industry,String location);
    List<Compensation> findAllByAgeRangeAndJobTitle(String ageRange, String jobTitle);
    List<Compensation> findAllByAnnualSalaryAndJobTitle(String annualSalary, String jobTitle);

    List<Compensation> findAllByAnnualSalaryGreaterThanEqualAndLocation(String annualSalary, String location);

}
