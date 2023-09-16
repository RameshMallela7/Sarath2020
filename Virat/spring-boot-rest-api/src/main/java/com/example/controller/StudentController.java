package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getStudentByLastName/{name}")
    public List<Student> getStudent(@PathVariable String name){
        return studentService.getStudentByLastName(name);
    }
}
