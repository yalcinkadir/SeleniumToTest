package com.StudentsManager;

import org.openqa.selenium.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    List<Student> students = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        StudentManagement s1 = new StudentManagement();

        s1.showProcess();
    }

    public void showProcess() {
        Scanner chooseProcess = new Scanner(System.in);
        System.out.println("Choose your process: \n1 add new student " +
                "\n2 remove student \n3 payment of an installment \n4 ask debts\n5 list of students");
        int processId = chooseProcess.nextInt();

        switch (processId) {
            case 1:
                addStudent();
                showProcess();
                break;
            case 2:
                removeStudent();
                showProcess();
                break;
            case 3:
                //Todo
                break;
            case 4:
                //ToDo
                break;
            case 5:
                listStudent();
                showProcess();
                break;

            default:
                System.out.println("give a number");
                break;
        }

    }

    public void addStudent() {

        Scanner scannerId = new Scanner(System.in);
        System.out.print("ID of Student:    ");
        int id = scannerId.nextInt();

        Scanner scannerName = new Scanner(System.in);
        System.out.print("Name of Student:  ");
        String name = scannerName.nextLine();

        Scanner scannerBranch = new Scanner(System.in);
        System.out.print("Branch of Study:  ");
        String branch = scannerBranch.nextLine();

        Scanner scannerDebts = new Scanner(System.in);
        System.out.print("Debt of Student:  ");
        int debts = Integer.parseInt(scannerDebts.nextLine());

        Student student = new Student(name, branch, debts, id);

        students.add(student);
    }

    public void listStudent() {

        students.forEach(s -> {
            System.out.println(s.toString());
        });

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void removeStudent() {

        Scanner scannerId = new Scanner(System.in);
        System.out.print("ID of Student:    ");
        int id = scannerId.nextInt();

        Student findStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElseThrow(NotFoundException::new);
        students.remove(findStudent);

    }
}
