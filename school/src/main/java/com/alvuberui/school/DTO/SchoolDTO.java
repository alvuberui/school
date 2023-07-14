package com.alvuberui.school.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchoolDTO {

    /*
     * School id
     */
    @JsonProperty("id")
    private Long id;

    /*
     * School name
     */
    @JsonProperty("name")
    private String name;

    /*
     * School email
     */
    @JsonProperty("email")
    private String email;
}
