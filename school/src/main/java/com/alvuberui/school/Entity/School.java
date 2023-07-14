package com.alvuberui.school.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * School Entity class
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

    /*
     * Student id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    /*
     * School name
     */
    private String name;

    /*
     * School email
     */
    @Column(name="email", nullable = false, unique = true)
    private String email;
}
