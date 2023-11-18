package com.example.service;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentService {

    private final ModelMapper modelMapper;
    private final StudentRepository studentRepository;

    public StudentService(ModelMapper modelMapper, StudentRepository studentRepository) {
        this.modelMapper = modelMapper;
        this.studentRepository = studentRepository;
    }

    public Optional<StudentDTO> saveStudent(StudentDTO studentDto) {
        return Optional.ofNullable(studentDto)
                .map(dto -> modelMapper.map(dto, Student.class))
                .map(studentRepository::save)
                .map(entity -> modelMapper.map(entity, StudentDTO.class));
    }

    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(student -> modelMapper.map(student, StudentDTO.class))
                .toList();
    }

    public StudentDTO getStudentById(Long id){
        return studentRepository.findById(id)
                .map(student -> modelMapper.map(student, StudentDTO.class))
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id : " + id));
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public StudentDTO updateStudent(StudentDTO studentDto) {
        return Optional.ofNullable(studentDto)
                .map(dto -> modelMapper.map(dto, Student.class))
                .map(studentRepository::save)
                .map(entity -> modelMapper.map(entity, StudentDTO.class))
                .orElse(null); // or throw an exception or handle the null case appropriately
    }

    public List<Student> getAllStudentsByIds(List<Long> ids){
        return studentRepository.findAllById(ids);
    }



}
