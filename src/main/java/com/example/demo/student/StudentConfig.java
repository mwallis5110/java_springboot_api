package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mason = new Student(
                "Mason",
                "masonwallis@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 1)
            );
             Student paul = new Student(
                "Paul",
                "pauljohnson@gmail.com",
                LocalDate.of(2001, Month.JANUARY, 7)
            );

            repository.saveAll(
                List.of(mason, paul)
                );
        };
    }
}
