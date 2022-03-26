package com.example.demo.student;

import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    public List<Student> 
    getStudents() {
        return List.of(
            new Student(
                1L,
                "Mason",
                "masonwallis@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 1),
                22
            )
        );
    }
}
