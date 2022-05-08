package com.kadir.employee;

import static java.lang.System.out;

public class Employee {

    private String name;
    private String jobTitle;
    private double amountPaid;
    public void cutCheck(double amountPaid) {
        this.amountPaid = amountPaid;
        out.printf("Pay to the order of %s ", name);
        out.printf("(%s) ***$", jobTitle);
        out.printf("%,.2f\n", amountPaid);
    }






    public void setName(String nameIn) {
        name = nameIn.toUpperCase();
    }
    public String getName() {
        return name;
    }
    public void setJobTitle(String jobTitleIn) {
        jobTitle = jobTitleIn.toUpperCase();
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getAmountPaid() {
        return amountPaid;
    }
}
