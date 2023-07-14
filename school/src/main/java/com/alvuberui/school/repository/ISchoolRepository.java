package com.alvuberui.school.repository;

import com.alvuberui.school.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISchoolRepository extends JpaRepository<School, Long> {
}
