package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "DB_TIME_STAMP")
    private LocalDateTime dbTimeStamp;

}
