package com.example.sprig.controller;

import com.example.sprig.model.Student;
import com.example.sprig.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping(path = "/students/{studentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getStudent(@PathVariable long studentId){
       List<Student> std =  studentService.getStudent(1L);

//        Student std = new Student("rushikesh","kandekar","12/12/2012","sangamner");
//        std.getFirtName();
//        std.getLastName();
//        std.getDateOfBirth();
//        std.getCity();
        return new ResponseEntity<>(std, HttpStatus.OK);
    }

}
