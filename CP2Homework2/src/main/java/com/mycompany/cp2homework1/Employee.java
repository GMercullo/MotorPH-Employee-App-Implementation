/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2homework1;

/**
 *
 * @author gmmercullo
 */
import java.util.Date;

public class Employee {
    private String employeeID;
    private String fullName;
    private Date birthDate;
    private String position;
    private Department department;
    private double salaryRate;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Salary Rate: " + salaryRate);
        if (department != null) {
            System.out.println("Department: " + department.getDepartmentName());
            System.out.println("Supervisor: " + department.getDepartmentSupervisor());
        }
    }
}

