package com.example.controller;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("saveStudent")
    public StudentDto saveStudent(@RequestBody StudentDto studentDto) {
        return studentService.saveStudent(studentDto);
    }

    @GetMapping("getAllStudents")
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public StudentDto getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getStudentByLastName/{name}")
    public List<Student> getStudent(@PathVariable String name) {
        return studentService.getStudentByLastName(name);
    }

    @PostMapping("updateStudent")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto) {
        return studentService.updateStudent(studentDto);
    }

    @PostMapping("getAllStudentsByIds")
    public List<Student> getAllStudentsByIds(@RequestBody List<Long> ids) {
        return studentService.getAllStudentsByIds(ids);
    }


}
