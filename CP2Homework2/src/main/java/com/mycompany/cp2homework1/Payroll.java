/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2homework1;

/**
 *
 * @author gmmercullo
 */
public class Payroll {
private Employee employee;
    private double basicPay;
    private double sssDeduction;
    private double philHealthDeduction;
    private double pagibigDeduction;
    private double withholdingTax;
    private double netPay;
    private String payrollDay;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getSssDeduction() {
        return sssDeduction;
    }

    public void setSssDeduction(double sssDeduction) {
        this.sssDeduction = sssDeduction;
    }

    public double getPhilHealthDeduction() {
        return philHealthDeduction;
    }

    public void setPhilHealthDeduction(double philHealthDeduction) {
        this.philHealthDeduction = philHealthDeduction;
    }

    public double getPagibigDeduction() {
        return pagibigDeduction;
    }

    public void setPagibigDeduction(double pagibigDeduction) {
        this.pagibigDeduction = pagibigDeduction;
    }

    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public String getPayrollDay() {
        return payrollDay;
    }

    public void setPayrollDay(String payrollDay) {
        this.payrollDay = payrollDay;
    }

    public double calculateNetPay() {
        netPay = basicPay - (sssDeduction + philHealthDeduction + pagibigDeduction + withholdingTax);
        return netPay;
    }

    public void generatePayslip() {
        System.out.println("Employee: " + employee.getFullName());
        System.out.println("Payroll Day: " + payrollDay);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("SSS: " + sssDeduction);
        System.out.println("PhilHealth: " + philHealthDeduction);
        System.out.println("Pag-IBIG: " + pagibigDeduction);
        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Pay: " + calculateNetPay());
    }
}
   
