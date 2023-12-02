package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StudentDTO {

    private Long id;

    @NotBlank(message = "Please enter valid name")
    private String name;

    @Min(18)
    @Max(70)
    private Integer age;

    @Email(message = "Please enter valid email")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Please enter valid mobile")
    private String mobile;

    @NotBlank(message = "Please enter valid address")
    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime dbTimeStamp;
}
