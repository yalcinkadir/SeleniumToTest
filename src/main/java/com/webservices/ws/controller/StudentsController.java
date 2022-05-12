package com.webservices.ws.controller;

import com.webservices.ws.controller.StudentsManager.Student;
import com.webservices.ws.controller.StudentsManager.StudentManagement;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController extends StudentManagement {

    @PostMapping("/addStudent")
    String newStudent(@RequestBody Student newStudent) {
        addStudent(newStudent);
        insertData(newStudent);
        return "added new student";
    }
    public static void insertData(Student student) {
        System.out.println("Data added in Database");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels", "root", "root1234");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO Students (id, name, branch, debts)     \n" +
                    "VALUES (" + student.getId() + ", '" + student.getName() + "',  '" + student.getBranch() + "', " + student.getDebts() + ")");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @GetMapping("/showStudent")
    List<Student> all() {
        return listStudent();
    }
    public static List<Student> listStudent() {

        ArrayList<Student> students = new ArrayList<>();

        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels", "root", "root1234");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Students as c\n");

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setBranch(rs.getString("branch"));
                student.setDebts(rs.getInt("debts"));
                students.add(student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @GetMapping("/getStudent/{id}")
    Student findStudent(@PathVariable int id) { return filterStudent(id);}

    public Student filterStudent(int id) {
        Student student = new Student();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels", "root", "root1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students where id = " + id);
            if(rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setBranch(rs.getString("branch"));
                student.setDebts(rs.getInt("debts"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return student;
    }


}
