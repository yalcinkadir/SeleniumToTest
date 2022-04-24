package com.webservices.StudentsManager;

public class Student {

    private String name;
    private String branch;
    private int debts;
    private int  id;

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.branch + " " + this.debts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getDebts() {
        return debts;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
