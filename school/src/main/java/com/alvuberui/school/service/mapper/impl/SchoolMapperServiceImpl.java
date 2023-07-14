package com.alvuberui.school.service.mapper.impl;

import com.alvuberui.school.DTO.SchoolDTO;
import com.alvuberui.school.Entity.School;
import com.alvuberui.school.service.mapper.ISchoolMapperService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

/*
 * Student Mapper Service class
 */
public class SchoolMapperServiceImpl implements ISchoolMapperService {

    /*
     * ModelMapper instance
     */
    private static final ModelMapper modelMapper = new ModelMapper();

    /*
        * Convert a list of schools to a list of schoolDTOs
        * @param schools the list of schools to be converted
        * @return a list of schoolDTOs
     */
    @Override
    public List<SchoolDTO> convertListToDTO(List<School> students) {
        return modelMapper.map(students, new TypeToken<List<SchoolDTO>>(){}.getType());
    }

    /*
        * Convert a school to a schoolDTO
        * @param school the school to be converted
        * @return a schoolDTO
     */
    @Override
    public SchoolDTO convertToDTO(School student) {
        return modelMapper.map(student, SchoolDTO.class);
    }

    /*
        * Convert a list of schoolDTOs to a list of schools
        * @param schoolDTOs the list of schoolDTOs to be converted
        * @return a list of schools
     */
    @Override
    public School convertToEntity(SchoolDTO studentDTO) {
        return modelMapper.map(studentDTO, School.class);
    }
}
