package com.mycompany.hw2;

import java.util.Date;

/**
 * Represents an employee with basic personal and job-related details.
 * 
 * Author: gmmercullo
 */
public class Employee {
    
    // Unique employee identifier
    private int employeeId;

    // Full name of the employee
    private String fullName;

    // Employee's birth date
    private Date birthDate;

    // Job position/title
    private String position;

    // Home address
    private String address;

    // Contact phone number
    private int phoneNumber;

    // Employment status (e.g., Regular, Probationary)
    private String status;

    // Department where the employee works
    private String department;

    /**
     * Parameterized constructor to initialize all employee details.
     * 
     * @param employeeId   The ID of the employee
     * @param fullName     Full name
     * @param birthDate    Birth date
     * @param position     Job position
     * @param address      Residential address
     * @param phoneNumber  Contact number
     * @param status       Employment status
     * @param department   Department name
     */
    public Employee(int employeeId, String fullName, Date birthDate, String position,
                    String address, int phoneNumber, String status, String department) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.department = department;
    }

    /**
     * Default constructor.
     */
    public Employee() {
        // No-arg constructor
    }

    // Getter and setter methods

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
