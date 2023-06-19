package com.alvuberui.student.Service.mapper.impl;

import com.alvuberui.student.DTO.StudentDTO;
import com.alvuberui.student.Entity.Student;
import com.alvuberui.student.Service.mapper.IStudentMapperService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

/*
 * Student Mapper Service class
 */
public class StudentMapperServiceImpl implements IStudentMapperService {

    /*
        * ModelMapper instance
     */
    private static final ModelMapper modelMapper = new ModelMapper();

    /*
        * Convert a list of students to a list of studentDTOs
        * @param students the list of students to be converted
        * @return a list of studentDTOs
     */
    @Override
    public List<StudentDTO> convertListToDTO(List<Student> students) {
        return modelMapper.map(students, new TypeToken<List<StudentDTO>>(){}.getType());
    }

    /*
        * Convert a student to a studentDTO
        * @param student the student to be converted
        * @return a studentDTO
     */
    @Override
    public StudentDTO convertToDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    /*
        * Convert a list of studentDTOs to a list of students
        * @param studentDTOs the list of studentDTOs to be converted
        * @return a list of students
     */
    @Override
    public Student convertToEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}
