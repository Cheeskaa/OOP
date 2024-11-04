/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author cheska
 */
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;
    
    public HourlyEmployee() {
        
    }
    
    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }
    
    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary() {
        double regularPay;
        double overtimePay = 0;

        if (totalHoursWorked > 40) {
            double regularHours = 40;
            double overtimeHours = totalHoursWorked - 40;
            regularPay = regularHours * ratePerHour;
            overtimePay = overtimeHours * ratePerHour * 1.5;
        } else {
            regularPay = totalHoursWorked * ratePerHour;
        }

        return regularPay + overtimePay;
    }
    
    public void displayHourlyEmployee() {
        System.out.println(this);
        System.out.println("Computed Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Hours Worked: " + totalHoursWorked + "\nRate per Hour: " + ratePerHour; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
