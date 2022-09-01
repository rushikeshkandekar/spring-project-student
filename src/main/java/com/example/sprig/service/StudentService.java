package com.example.sprig.service;

import com.example.sprig.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.ArrayList;

@Service
public class StudentService {

    public List<Student> getStudent(Long studentId){
        List<Student> list = new ArrayList<>();
        list.add(new Student(2323,"rushikesh","kandekar","12/12/2012","sangamner"));
        list.add(new Student(9898,"ajit","aher","23/04/2000","nashik"));
        return list;
    }
}
