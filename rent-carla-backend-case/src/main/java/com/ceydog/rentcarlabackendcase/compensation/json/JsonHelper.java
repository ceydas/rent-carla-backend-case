package com.ceydog.rentcarlabackendcase.compensation.json;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationSparseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JsonHelper {
    //todo: fix the hard coded pathname
    public static List<CompensationJsonDto> jsonFileToDtoList() throws IOException {
        String path = "/Users/ceydog/Desktop/github_repos/rent-carla-backend-case/rent-carla-backend-case/src/main/resources/compensation_dataset/salary_survey-1.json";
        byte[] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();

        // Assuming the JSON is an array of objects
        // todo: handle other types of data
        List<CompensationJsonDto> compensationJsonDtoList = objectMapper.readValue(jsonData, new TypeReference<>() {});
        return compensationJsonDtoList;
    }

    public static List<CompensationSparseDto> jsonFileToSparseDtoList() throws IOException {
        String path = "/Users/ceydog/Desktop/github_repos/rent-carla-backend-case/rent-carla-backend-case/src/main/resources/compensation_dataset/salary_survey-1.json";
        byte[] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();

        // Assuming the JSON is an array of objects
        // todo: handle other types of data
        List<CompensationSparseDto> compensationJsonDtoList = objectMapper.readValue(jsonData, new TypeReference<>() {});
        return compensationJsonDtoList;
    }





}
