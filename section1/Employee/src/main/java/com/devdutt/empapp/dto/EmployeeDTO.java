package com.devdutt.empapp.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jdk.jfr.Name;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    @JsonIgnore
    private Long id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min=5,max = 20,message = "Name should be between 5 and 20 characters")
    private String name;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;
    @NotEmpty(message = "Address should not be empty")
    private String address;
    @NotEmpty(message = "Phone should not be empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Phone number should be 10 digits")
    private String phone;

}
