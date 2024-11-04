/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries.version1;

/**
 *
 * @author cheska
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee(01, "Chizka", 45, 20.0);
        HourlyEmployee h2 = new HourlyEmployee(02, "Alyssa");
        HourlyEmployee h3 = new HourlyEmployee();
        
        h2.setTotalHoursWorked(50);
        h2.setRatePerHour(15);
        
        h3.setEmpID(03);
        h3.setEmpName("Yza");
        h3.setRatePerHour(20);
        h3.setTotalHoursWorked(60);
        
        PieceWorkerEmployee p4 = new PieceWorkerEmployee(04, "Joel", 250, 5.0);
        PieceWorkerEmployee p5 = new PieceWorkerEmployee(05, "Jomer");
        PieceWorkerEmployee p6 = new PieceWorkerEmployee();
        
        p5.setRatePerPiece(15);
        p5.setTotalPiecesFinished(500);
        
        p6.setEmpID(06);
        p6.setEmpName("January");
        p6.setRatePerPiece(30);
        p6.setTotalPiecesFinished(300);
        
        CommissionEmployee c1 = new CommissionEmployee(07, "Trese", 200000); 
        CommissionEmployee c2 = new CommissionEmployee(8, "Diana");
        CommissionEmployee c3 = new CommissionEmployee();
        
        c2.setTotalSales(300000);

        c3.setEmpID(9);
        c3.setEmpName("Alyssa");
        c3.setTotalSales(500000);
        
        BasedPlusCommissionEmployee bp4 = new BasedPlusCommissionEmployee(10, "Sam", 250000, 10000);
        BasedPlusCommissionEmployee bp5 = new BasedPlusCommissionEmployee(11, "Kate");
        BasedPlusCommissionEmployee bp6 = new BasedPlusCommissionEmployee();
        
        bp5.setBaseSalary(500000);
        bp5.setTotalSales(9000);
        
        bp6.setEmpID(12);
        bp6.setEmpName("Shanley");
        bp6.setBaseSalary(150000);
        bp6.setTotalSales(15000);
        
        //Hourly Employee
        System.out.println("Hourly Employee:");
        h1.displayHourlyEmployee();
        h2.displayHourlyEmployee();
        h3.displayHourlyEmployee();
        
        //Piece Worker Employee
        System.out.println("\nPiece Worker Employee:");
        p4.displayPieceWorkerEmployee();
        p5.displayPieceWorkerEmployee();
        p6.displayPieceWorkerEmployee();
        
        //CommissionEmployee
        System.out.println("\nCommission Employee:");
        c1.displayCommissionEmployee();
        c2.displayCommissionEmployee();
        c3.displayCommissionEmployee();
        
        //BasedPlusCommissionEmployee
        System.out.println("\nBased Plus Commission Employee:");
        bp4.displayBasedPlusCommissionEmployee();
        bp5.displayBasedPlusCommissionEmployee();
        bp6.displayBasedPlusCommissionEmployee();
    }
}
