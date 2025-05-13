/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2homework1;

/**
 *
 * @author gmmercullo
 */
import java.sql.Time;
import java.util.Date;

public class Attendance {
    private Employee employee;
    private Date date;
    private Time timeIn;
    private Time timeOut;

    public String getEmployeeID() {
        return employee.getEmployeeID();
    }

    public void setEmployeeID(String employeeID) {
        this.employee.setEmployeeID(employeeID);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    public double calculateHoursWorked() {
        long milliseconds = timeOut.getTime() - timeIn.getTime();
        return milliseconds / (1000.0 * 60 * 60);
    }
}
