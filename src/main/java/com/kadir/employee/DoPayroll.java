package com.kadir.employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {


    public static void main(String[] args) throws IOException {

        FileWriter myWriter = new FileWriter("EmployeeList.txt");
        //ToDo
        //read from scanner and add to the File

        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        for (int empNum = 1; empNum <= 3; empNum++) {

            Employee createdEmployee = payOneEmployee(diskScanner);
            writeToFile(createdEmployee, myWriter);
        }
        diskScanner.close();
        myWriter.close();
    }

    static Employee payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
        return anEmployee;
    }

    public static void writeToFile(Employee creatingEmployee, FileWriter writer) throws IOException {
        writer.write(creatingEmployee.getName() + "\n" + creatingEmployee.getJobTitle() + "\n" + creatingEmployee.getAmountPaid() + "\n");
    }
}
