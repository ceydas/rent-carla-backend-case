package com.ceydog.rentcarlabackendcase.compensation.service;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import com.ceydog.rentcarlabackendcase.compensation.json.JsonHelper;
import com.ceydog.rentcarlabackendcase.compensation.mapper.CompensationMapper;
import com.ceydog.rentcarlabackendcase.compensation.repository.CompensationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompensationEntityService {
    private final CompensationRepository compensationRepository;

    public List<Compensation> findAll() throws IOException {
        List<Compensation> compensationList = compensationRepository.findAll();

        return compensationList;
    }

    public List<Compensation> findAll(Pageable pageable) throws IOException {
        List<Compensation> compensationList = compensationRepository.findAll(pageable).getContent();

        return compensationList;
    }

    public Compensation findByIdWithControl(Long id){

        Optional<Compensation> optionalCompensation = compensationRepository.findById(id);

        Compensation compensation;
        if (optionalCompensation.isPresent()){
            compensation = optionalCompensation.get();
        } else {
            throw new RuntimeException("Compensation data does not exist!");
        }

        return compensation;

    }

    public List<Compensation> findAllByAnnualSalaryGreaterThanEqualAndLocation(String annualSalary, String location){
        List<Compensation> compensationList = compensationRepository.findAllByAnnualSalaryGreaterThanEqualAndLocation(annualSalary,location);
        return compensationList;
    }

    public void saveAll() throws IOException {
        List<CompensationJsonDto> compensationJsonDtoList = JsonHelper.jsonFileToDtoList();
        List<Compensation> compensationList = CompensationMapper.INSTANCE.convertToCompensationList(compensationJsonDtoList);
        compensationRepository.saveAll(compensationList);
    }

}
