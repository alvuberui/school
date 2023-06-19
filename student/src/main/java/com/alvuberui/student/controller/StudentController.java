package com.alvuberui.student.controller;

import com.alvuberui.student.DTO.StudentDTO;
import com.alvuberui.student.Service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * This class is the controller for the student entity
 */
@RestController("/students")
public class StudentController {

    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    /*
     * Create a new student
     * @param studentDTO the student to be created
     * @return the created student
     */
    @PostMapping
    public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.createStudent(studentDTO);
    }

    /*
     * Get all students
     * @return a list of all students
     */
    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }
}
