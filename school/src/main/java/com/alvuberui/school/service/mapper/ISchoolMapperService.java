package com.alvuberui.school.service.mapper;

import com.alvuberui.school.DTO.SchoolDTO;
import com.alvuberui.school.Entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Student Mapper Service interface
 */
@Service
public interface ISchoolMapperService {

    /*
     * Convert a SchoolDTO to a School
     * @param List<School> the schools to be converted
     * @return List<SchoolDTO> the converted schools
     */
    public List<SchoolDTO> convertListToDTO(List<School> schools);

    /*
     * Convert a SchoolDTO to a School
     * @param SchoolDTO the school to be converted
     * @return School the converted school
     */
    public SchoolDTO convertToDTO(School student);

    /*
     * Convert a School to a SchoolDTO
     * @param School the school to be converted
     * @return SchoolDTO the converted school
     */
    public School convertToEntity(SchoolDTO studentDTO);
}
