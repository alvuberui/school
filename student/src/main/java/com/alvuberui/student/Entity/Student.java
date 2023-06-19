package com.alvuberui.student.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Student Entity class
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    /*
     * Student id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    /*
     * Student first name
     */
    @Column(name="first_name", nullable = false)
    private String firstName;

    /*
     * Student last name
     */
    @Column(name="last_name", nullable = false)
    private String lastName;

    /*
     * Student email
     */
    @Column(name="email", nullable = false, unique = true)
    private String email;

    /*
     * Student school id
     */
    @Column(name="school_id", nullable = false)
    private Long schoolId;
}
