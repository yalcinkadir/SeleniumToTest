package com.webservices.StudentsManager;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController extends StudentManagement {

    @PostMapping("/addStudent")
     String newStudent(@RequestBody Student newStudent) {
        addStudent(newStudent);
        return "added new student";
    }

    @GetMapping("/showStudent")
    List<Student> all() {
        return getStudents();
    }

    @GetMapping("/getStudent/{id}")
    Student findStudent(@PathVariable int id) {
        return findStudentById(id);
    }

}
