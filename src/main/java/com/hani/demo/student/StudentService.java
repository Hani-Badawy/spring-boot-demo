package com.hani.demo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
            new Student("Hani", "Mohammed","hani@example.com"),
            new Student("Ahmed", "Ali","ahmed@gmx.com"),
            new Student("John", "Doe","john@web.com"));
}
    }

