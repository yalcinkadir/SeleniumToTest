package com.webservices.ws.controller;

import com.webservices.ws.controller.StudentsManager.Student;
import com.webservices.ws.controller.StudentsManager.StudentManagement;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
        return getStudents();
    }
    public static void listCustomer(Student student) {

        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels", "root", "root1234");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM customers as c\n" +
                    "INNER JOIN orders as o\n" +
                    "ON c.customerNumber = o.customerNumber where c.customerNumber = 103");

            while (true) {
                if (!rs.next()) break;
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString("phone"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @GetMapping("/getStudent/{id}")
    Student findStudent(@PathVariable int id) {
        return findStudentById(id);
    }

}
