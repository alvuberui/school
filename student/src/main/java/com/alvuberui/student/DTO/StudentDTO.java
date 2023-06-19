package com.alvuberui.student.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    /*
     * Student id
     */
    @JsonProperty("id")
    private Long id;

    /*
     * Student first name
     */
    @JsonProperty("firstName")
    private String firstName;

    /*
     * Student last name
     */
    @JsonProperty("lastName")
    private String lastName;

    /*
     * Student email
     */
    @JsonProperty("email")
    private String email;

    /*
     * Student school id
     */
    @JsonProperty("schoolId")
    private Long schoolId;
}
