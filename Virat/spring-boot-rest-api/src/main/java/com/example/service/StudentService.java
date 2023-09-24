package com.example.service;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public StudentDto saveStudent(StudentDto studentDto){
        Student student = modelMapper.map(studentDto, Student.class);
        Student responseStudent = studentRepository.save(student);
        return modelMapper.map(responseStudent, StudentDto.class);
    }

    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();
    }

    public StudentDto getStudentById(Long id){
        return studentRepository.findById(id)
                .map(student -> modelMapper.map(student, StudentDto.class))
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id : " + id));
    }

    public List<Student> getStudentByLastName(String name) {
        return studentRepository.findByLastName(name);
    }

    public StudentDto updateStudent(StudentDto studentDto) {
        Student responseStudent = studentRepository.save(modelMapper.map(studentDto, Student.class));
        return modelMapper.map(responseStudent, StudentDto.class);
    }

    public List<Student> getAllStudentsByIds(List<Long> ids){
        return studentRepository.findAllById(ids);
    }



}
