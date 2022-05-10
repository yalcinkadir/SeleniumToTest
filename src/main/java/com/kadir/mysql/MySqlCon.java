package com.kadir.mysql;

import java.sql.*;

class MysqlCon {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels", "root", "root1234");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            listCustomer(stmt);
            // createAccount(stmt);
            //insertData(stmt);



            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void createAccount(Statement statement) {
        try {
            statement.executeUpdate("create table ACCOUNTS\" +\n" +
                    "                    \"(NAME VARCHAR(32) NOT NULL PRIMARY KEY, \" +\n" +
                    "                    \"   ADDRESS VARCHAR(32),\" +\n" +
                    "                    \"   BALANCE FLOAT)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ACCOUNTS table created.");
    }

    public static void listCustomer(Statement statement) {
        ResultSet rs = null;
        try {
            rs = statement.executeQuery("SELECT * FROM customers as c\n" +
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

    public static void insertData(Statement statement){

        try {
            statement.executeUpdate("INSERT INTO ACCOUNTS (Name, Address, Balance)     \n" +
                    "VALUES ('Yusuf Kerem', 'Vienna', 250);      ");
            System.out.println("Data added in Database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}