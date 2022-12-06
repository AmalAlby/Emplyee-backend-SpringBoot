package com.example.employeenew_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.security.PrivateKey;

@Entity
@Table(name = "Employee")
public class AddEmployee {

    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String empname;
    private String designation;
    private int salary;
    private String companyname;
    private String mobilenumber;
    private String username;
    private String password;

    public AddEmployee() {
    }

    public AddEmployee(int id, int empcode, String empname, String designation, int salary, String companyname, String mobilenumber, String username, String password) {
        this.id = id;
        this.empcode = empcode;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.companyname = companyname;
        this.mobilenumber = mobilenumber;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
