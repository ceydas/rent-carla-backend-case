package com.ceydog.rentcarlabackendcase.compensation.controller;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.repository.CompensationRepository;
import com.ceydog.rentcarlabackendcase.compensation.service.CompensationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/compensation_data")
public class CompensationController {
    private final CompensationRepository compensationRepository;
    private final CompensationService compensationService;


    @GetMapping
    public ResponseEntity findAll() throws IOException {

        List<CompensationJsonDto> compensationJsonDtoList = compensationService.findAll();

        return ResponseEntity.ok(compensationJsonDtoList);
    }












}
