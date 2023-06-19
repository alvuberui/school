package com.alvuberui.student.Repository;

import com.alvuberui.student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
