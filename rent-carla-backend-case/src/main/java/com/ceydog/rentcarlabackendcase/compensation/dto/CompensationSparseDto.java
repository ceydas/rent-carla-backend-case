package com.ceydog.rentcarlabackendcase.compensation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompensationSparseDto {
    private String jobTitle;
    private String annualSalary;
}
