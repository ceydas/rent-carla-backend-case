package com.ceydog.rentcarlabackendcase.compensation.mapper;

import com.ceydog.rentcarlabackendcase.compensation.dto.CompensationJsonDto;
import com.ceydog.rentcarlabackendcase.compensation.entity.Compensation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompensationMapper {
    CompensationMapper INSTANCE = Mappers.getMapper(CompensationMapper.class);

    Compensation convertToCompensation(CompensationJsonDto compensationJsonDto);

    CompensationJsonDto convertToCompensationDto(Compensation compensation);

    List<CompensationJsonDto> convertToCompensationDtoList(List<Compensation> compensationList);

    List<Compensation> convertToCompensationList(List<CompensationJsonDto> compensationJsonDto);



}





