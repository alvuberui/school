package com.alvuberui.student.Service;

import com.alvuberui.student.DTO.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Student Service interface
 */
@Service
public interface IStudentService {

    /*
     * Create a new student
     * @param studentDTO the student to be created
     * @return the created student
     */
    public StudentDTO createStudent(StudentDTO studentDTO);

    /*
     * Get all students
     * @return a list of all students
     */
    public List<StudentDTO> getAllStudents();
}
