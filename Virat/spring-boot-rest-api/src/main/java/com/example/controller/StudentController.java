package com.example.controller;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.service.StudentService;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody StudentDTO studentDto) throws JsonProcessingException {
        return studentService.saveStudent(studentDto);
    }

    @GetMapping("getAllStudents")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public StudentDTO getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getStudentByLastName/{name}")
    public List<Student> getStudent(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @PostMapping("updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDto) {
        return studentService.updateStudent(studentDto);
    }

    @PostMapping("getAllStudentsByIds")
    public List<Student> getAllStudentsByIds(@RequestBody List<Long> ids) {
        return studentService.getAllStudentsByIds(ids);
    }

}
