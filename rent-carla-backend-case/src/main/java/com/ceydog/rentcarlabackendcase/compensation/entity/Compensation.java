package com.ceydog.rentcarlabackendcase.compensation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Compensation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ageRange;
    private String timestamp;
    private String industry;
    private String jobTitle;
    private String jobTitleContext;
    private String annualSalary;
    private String currency;
    private String location;
    private String workExperienceInYears;

}
