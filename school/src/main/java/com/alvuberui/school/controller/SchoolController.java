package com.alvuberui.school.controller;

import com.alvuberui.school.DTO.SchoolDTO;
import com.alvuberui.school.service.ISchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * This class is the controller for the student entity
 */
@RestController("/schools")
public class SchoolController {

    private final ISchoolService schoolService;

    public SchoolController(ISchoolService schoolService) {
        this.schoolService = schoolService;
    }

    /*
     * Create a new student
     * @param studentDTO the student to be created
     * @return the created student
     */
    @PostMapping
    public SchoolDTO createStudent(@RequestBody SchoolDTO studentDTO) {
        return schoolService.createSchool(studentDTO);
    }

    /*
     * Get all students
     * @return a list of all students
     */
    @GetMapping
    public List<SchoolDTO> getAllStudents() {
        return schoolService.getAllSchool();
    }
}
