/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author cheska
 */
public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;
    
    public PieceWorkerEmployee() {
        
    }
    
    public PieceWorkerEmployee(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }
    
    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, double ratePerPiece){
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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
        double salary = totalPiecesFinished * ratePerPiece;
        int additionalBonus = totalPiecesFinished / 100;
        double bonus = additionalBonus * 10 * ratePerPiece;
        return salary + bonus;
    }
    
    public void displayPieceWorkerEmployee() {
        System.out.println(this);
        System.out.println("Computed Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Pieces Finished: " + totalPiecesFinished + "\nRate Per Piece: " + ratePerPiece;
    }
}
