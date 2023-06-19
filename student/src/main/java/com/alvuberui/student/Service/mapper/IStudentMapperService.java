package com.alvuberui.student.Service.mapper;

import com.alvuberui.student.DTO.StudentDTO;
import com.alvuberui.student.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Student Mapper Service interface
 */
@Service
public interface IStudentMapperService {

    /*
     * Convert a StudentDTO to a Student
     * @param List<Student> the students to be converted
     * @return List<StudentDTO> the converted students
     */
    public List<StudentDTO> convertListToDTO(List<Student> students);

    /*
     * Convert a StudentDTO to a Student
     * @param StudentDTO the student to be converted
     * @return Student the converted student
     */
    public StudentDTO convertToDTO(Student student);

    /*
     * Convert a Student to a StudentDTO
     * @param Student the student to be converted
     * @return StudentDTO the converted student
     */
    public Student convertToEntity(StudentDTO studentDTO);
}
