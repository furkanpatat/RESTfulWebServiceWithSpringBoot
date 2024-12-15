package com.furkanpatat.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
    @NotEmpty(message = "Name field cannot be empty!")
    @Size(min = 1, max = 50, message = "Name must contain at least 1 character and cannot exceed 50 characters!")
    private String firstName;
    @NotEmpty(message = "Surname field cannot be empty!")
    @Size(min = 1, max = 50, message = "Surname must contain at least 1 character and cannot exceed 50 characters!")
    private String lastName;
    private Date birthOfDate;

    @Email(message = "Enter an address in email format!")
    private String email;
}
