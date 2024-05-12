package com.ceydog.rentcarlabackendcase.compensation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompensationJsonDto {

    @JsonProperty("How old are you?")
    private String ageRange;

    @JsonProperty("Timestamp")
    private String timestamp;

    @JsonProperty("What industry do you work in?")
    private String industry;

    @JsonProperty("Job title")
    private String jobTitle;

    @JsonProperty("If your job title needs additional context, please clarify here")
    private String jobTitleContext;

    @JsonProperty("What is your annual salary?")
    private String annualSalary;

    @JsonProperty("Please indicate the currency")
    private String currency;

    @JsonProperty("Where are you located? (City/state/country)")
    private String location;

    @JsonProperty("How many years of post-college professional work experience do you have?")
    private String workExperienceInYears;


}

