package com.ceydog.rentcarlabackendcase.compensation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompensationJsonDto {


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

