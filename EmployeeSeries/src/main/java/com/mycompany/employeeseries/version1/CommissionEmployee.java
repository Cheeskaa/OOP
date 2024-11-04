/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author cheska
 */
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;
    
    public CommissionEmployee(int empID, String empName, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }
    
    public CommissionEmployee() {

    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
        double commissionRate;
        
        if(totalSales >= 1000000){
            commissionRate = 0.30;
        }
        else if(totalSales >= 100000){
            commissionRate = 0.20;
        }
        else if(totalSales >= 10000){
            commissionRate = 0.10;
        }
        else {
            commissionRate = 0.05;
        }
        
        return totalSales * (1 - commissionRate);
    }
    
    public void displayCommissionEmployee(){
        System.out.println(this);
        System.out.println("Computed Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Sales: " + totalSales;
    }
}
