package com.webservices.ws.controller.StudentsManager;

import org.openqa.selenium.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    private final List<Student> students = new ArrayList<>();

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

    public void paymentInstallment() {

        Scanner scannerId = new Scanner(System.in);
        System.out.print("ID of Student:    ");
        int id = scannerId.nextInt();

        Scanner scannerDebts = new Scanner(System.in);
        System.out.print("payment installment: ");
        int paymentDebts = Integer.parseInt(scannerDebts.nextLine());

        Student findStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElseThrow(NotFoundException::new);

        int result = findStudent.getDebts() - paymentDebts;
        findStudent.setDebts(result);

        System.out.println("new total debts " + findStudent.getDebts());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void askDebts() {

        Scanner scannerId = new Scanner(System.in);
        System.out.print("ID of Student:    ");
        int id = scannerId.nextInt();

        Student findStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElseThrow(NotFoundException::new);

        System.out.println("total debts: " + findStudent.getDebts());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
