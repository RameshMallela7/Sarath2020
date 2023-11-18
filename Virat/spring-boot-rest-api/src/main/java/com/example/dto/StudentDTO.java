package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StudentDTO {
    @JsonFormat
    private Long id;

    @JsonFormat
    private String name;

    @JsonFormat
    private Integer age;

    @JsonFormat
    private String email;

    @JsonFormat
    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime dbTimeStamp;
}
