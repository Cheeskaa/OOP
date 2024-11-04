/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author cheska
 */
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;
    
    public BasedPlusCommissionEmployee() {
        
    }
    
    public BasedPlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }
    
    public BasedPlusCommissionEmployee(int empID, String empName, double baseSalary, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
    
    public double computeSalary(){
        double commRate;
        
        if(totalSales >= 1000000){
            commRate = 0.30;
        }
        else if(totalSales >= 100000){
            commRate = 0.20;
        }
        else if(totalSales >= 10000){
            commRate = 0.10;
        }
        else {
            commRate = 0.05;
        }
        double commission = totalSales * (1 - commRate);
        
        return commission + baseSalary;
    }
    
    public void displayBasedPlusCommissionEmployee(){
        System.out.println(this);
        System.out.println("Computed Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nBase Salary: " + baseSalary + "\nTotal Sales: " + totalSales;
    }
}
