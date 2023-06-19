package com.alvuberui.student.Service.impl;

import com.alvuberui.student.DTO.StudentDTO;
import com.alvuberui.student.Repository.IStudentRepository;
import com.alvuberui.student.Service.IStudentService;
import com.alvuberui.student.Service.mapper.IStudentMapperService;

import java.util.List;

/*
 * Student Service class
 */
public class StudentService implements IStudentService {

    /*
     * Student repository
     */
    private IStudentRepository studentRepository;

    /*
        * Student mapper service
     */
    private IStudentMapperService studentMapperService;

    /*
     * Constructor
     * @param studentRepository the student repository
     * @param studentMapperService the student mapper service
     */
    public StudentService(IStudentRepository studentRepository, IStudentMapperService studentMapperService) {
        this.studentRepository = studentRepository;
        this.studentMapperService = studentMapperService;
    }

    /*
     * Create a new student
     * @param studentDTO the student to be created
     * @return the created student
     */
    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        studentDTO.setId(null);
        return studentMapperService.convertToDTO(studentRepository.save(studentMapperService.convertToEntity(studentDTO)));
    }

    /*
     * Get all students
     * @return a list of all students
     */
    @Override
    public List<StudentDTO> getAllStudents() {
        return studentMapperService.convertListToDTO(studentRepository.findAll());
    }
}
