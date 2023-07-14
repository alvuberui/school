package com.alvuberui.school.service.impl;

import com.alvuberui.school.DTO.SchoolDTO;
import com.alvuberui.school.repository.ISchoolRepository;
import com.alvuberui.school.service.ISchoolService;
import com.alvuberui.school.service.mapper.ISchoolMapperService;

import java.util.List;

/*
 * Student Service class
 */
public class SchoolService implements ISchoolService {

    /*
     * School repository
     */
    private ISchoolRepository schoolRepository;

    /*
        * School mapper service
     */
    private ISchoolMapperService studentMapperService;

    /*
     * Constructor
     * @param studentRepository the student repository
     * @param studentMapperService the student mapper service
     */
    public SchoolService(ISchoolRepository studentRepository, ISchoolMapperService studentMapperService) {
        this.schoolRepository = studentRepository;
        this.studentMapperService = studentMapperService;
    }

    /*
     * Create a new student
     * @param studentDTO the student to be created
     * @return the created student
     */
    @Override
    public SchoolDTO createSchool(SchoolDTO studentDTO) {
        studentDTO.setId(null);
        return studentMapperService.convertToDTO(schoolRepository.save(studentMapperService.convertToEntity(studentDTO)));
    }

    /*
     * Get all students
     * @return a list of all students
     */
    @Override
    public List<SchoolDTO> getAllSchool() {
        return studentMapperService.convertListToDTO(schoolRepository.findAll());
    }
}
