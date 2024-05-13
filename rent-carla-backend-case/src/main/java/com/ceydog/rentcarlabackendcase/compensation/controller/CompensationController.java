package com.ceydog.rentcarlabackendcase.compensation.controller;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationSparseDto;
import com.ceydog.rentcarlabackendcase.compensation.service.CompensationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/compensation_data")
public class CompensationController {
    private final CompensationService compensationService;

    @GetMapping()
    public ResponseEntity<List<CompensationJsonDto>> findAll(@RequestParam(required = false) String sort) throws IOException {

        Pageable pageable;
        if (sort != null) {
            Sort sorting = Sort.by(sort.split(","));
            pageable = PageRequest.of(0, 10, sorting);
        }
        else {
            pageable = PageRequest.of(0, 10);
        }

        List<CompensationJsonDto> compensationJsonDtoList = compensationService.findAll(pageable);
        return ResponseEntity.ok(compensationJsonDtoList);
    }

    @GetMapping("/fields")
    public ResponseEntity<CompensationJsonDto> findCompensationByIndustryAndLocation(@RequestParam(name = "industry") String industry,
                                                               @RequestParam(name = "location") String location) {

        CompensationJsonDto compensationJsonDto = compensationService.findCompensationByIndustryAndLocation(industry, location);

        return ResponseEntity.ok(compensationJsonDto);

    }

    @GetMapping("/fields=jobTitle,salary")
    public ResponseEntity<List<CompensationSparseDto>> getJobTitleAndSalary() throws IOException {

        Pageable pageable = PageRequest.of(0, 10);

        List<CompensationSparseDto> compensationSparseDto = compensationService.getJobTitleAndSalary(pageable);
        return ResponseEntity.ok(compensationSparseDto);
    }












}
