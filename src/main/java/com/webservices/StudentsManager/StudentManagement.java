package com.webservices.StudentsManager;

import org.openqa.selenium.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public Student findStudentById(int id) {

        Student findStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElseThrow(NotFoundException::new);
        return findStudent;

    }

}
