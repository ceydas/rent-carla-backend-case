package com.ceydog.rentcarlabackendcase.compensation.service;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationSparseDto;
import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import com.ceydog.rentcarlabackendcase.compensation.mapper.CompensationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompensationService {

    private final CompensationEntityService compensationEntityService;


    public List<CompensationJsonDto> findAll(){
        List<Compensation> compensationList = compensationEntityService.findAll();
        List<CompensationJsonDto> compensationJsonDtoList = CompensationMapper.INSTANCE.convertToCompensationDtoList(compensationList);
        return compensationJsonDtoList;
    }

    public List<CompensationJsonDto> findAll(Pageable pageable){
        List<Compensation> compensationList = compensationEntityService.findAll(pageable);
        List<CompensationJsonDto> compensationJsonDtoList = CompensationMapper.INSTANCE.convertToCompensationDtoList(compensationList);
        return compensationJsonDtoList;
    }

    public CompensationJsonDto findById(Long id){

        Compensation compensation = compensationEntityService.findByIdWithControl(id);
        CompensationJsonDto compensationJsonDto = CompensationMapper.INSTANCE.convertToCompensationDto(compensation);
        return compensationJsonDto;

    }

    public void saveAll() throws IOException {
        compensationEntityService.saveAll();
    }

    public List<CompensationJsonDto> getSortedCompensationData(Pageable pageable){
        List<Compensation> compensationList = compensationEntityService.findAll(pageable);
        List<CompensationJsonDto> compensationJsonDtoList = CompensationMapper.INSTANCE.convertToCompensationDtoList(compensationList);
        return  compensationJsonDtoList;
    }

    public CompensationJsonDto findCompensationByIndustryAndLocation(String industry, String location){
        Compensation compensation = compensationEntityService.findCompensationByIndustryAndLocation(industry, location);
        CompensationJsonDto compensationJsonDto = CompensationMapper.INSTANCE.convertToCompensationDto(compensation);

        return compensationJsonDto;

    }

    public List<CompensationSparseDto> getJobTitleAndSalary(Pageable pageable) throws IOException {
        List<Compensation> compensationList = compensationEntityService.findAll(pageable);
        List<CompensationSparseDto>  compensationSparseDtoList = CompensationMapper.INSTANCE.convertToCompensationSparseDtoList(compensationList);
        return compensationSparseDtoList;

    }




}
