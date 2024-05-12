package com.ceydog.rentcarlabackendcase.compensation.service;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import com.ceydog.rentcarlabackendcase.compensation.json.JsonHelper;
import com.ceydog.rentcarlabackendcase.compensation.mapper.CompensationMapper;
import com.ceydog.rentcarlabackendcase.compensation.repository.CompensationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompensationService {

    private final CompensationRepository compensationRepository;



    public List<CompensationJsonDto> findAll() throws IOException {
        List<Compensation> compensationList = compensationRepository.findAll();
        List<CompensationJsonDto> compensationJsonDtoList = CompensationMapper.INSTANCE.convertToCompensationDtoList(compensationList);

        return compensationJsonDtoList;
    }

    /*
    public CompensationJsonDto findById(Long id){
        boolean existsById = compensationRepository.existsById(id);
        if (!existsById){
            throw new RuntimeException("Compensation data does not exist!"); //todo: enum
        }
        return compensationRepository.findById(id);

    }
    
     */

    public void saveAll() throws IOException {
        List<CompensationJsonDto> compensationJsonDtoList = JsonHelper.jsonFileToDtoList();
        List<Compensation> compensationList = CompensationMapper.INSTANCE.convertToCompensationList(compensationJsonDtoList);
        compensationRepository.saveAll(compensationList);
    }



}
