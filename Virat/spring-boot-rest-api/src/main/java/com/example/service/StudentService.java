package com.example.service;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.StudentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class StudentService {


    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public String saveStudent(StudentDTO studentDto) throws JsonProcessingException {
        Student student = modelMapper.map(studentDto, Student.class);
        student.setDbTimeStamp(LocalDateTime.now());
        Student responseStudent = studentRepository.save(student);
        log.info("Student after save : {}", responseStudent);



        StudentDTO studentDTO = modelMapper.map(responseStudent, StudentDTO.class);

/*        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());*/
        /*Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS") // Optional date format
                .setDateFormat("yyyy-MM-dd")
                .create();
        String json = gson.toJson(dto);*/

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        String studentDTOAsString = objectMapper.writeValueAsString(studentDTO);
        log.info("StudentDTO as string : {}", studentDTOAsString);

        StudentDTO StudentDtoAsObject = objectMapper.readValue(studentDTOAsString, StudentDTO.class);
        log.info("StudentDTO as object : {}", StudentDtoAsObject);

        return studentDTOAsString;
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
        Student responseStudent = studentRepository.save(modelMapper.map(studentDto, Student.class));
        return modelMapper.map(responseStudent, StudentDTO.class);
    }

    public List<Student> getAllStudentsByIds(List<Long> ids){
        return studentRepository.findAllById(ids);
    }



}
