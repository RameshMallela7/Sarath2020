package com.example.controller;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filter")
public class FilterController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("{name}")
    public List<Student> getStudentByName(@PathVariable(name = "name") String name) {
        return studentRepository.findByName(name);
    }

    @PostMapping("/Specification")
    public List<Student> getStudents() {

        Specification<Student> specification = (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"), "sarath");

        return studentRepository.findAll(specification);
    }


}


