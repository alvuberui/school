package com.alvuberui.school.service;

import com.alvuberui.school.DTO.SchoolDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * School Service interface
 */
@Service
public interface ISchoolService {

    /*
     * Create a new school
     * @param schoolDTO the school to be created
     * @return the created school
     */
    public SchoolDTO createSchool(SchoolDTO schoolDTO);

    /*
     * Get all schools
     * @return a list of all schools
     */
    public List<SchoolDTO> getAllSchool();
}
