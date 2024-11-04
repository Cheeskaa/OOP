/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author cheska
 */
public class Version2 {
    public static void main(String[] args) {
        System.out.println("Hourly Employee:");
        HourlyEmployee2 n1 = new HourlyEmployee2(100,"cheska",101, 42);
        n1.display();
        
        HourlyEmployee2 n2 = new HourlyEmployee2();
        n2.setTotalHoursWorked(42);
        n2.setRatePerHour(100);
        n2.setEmpName("gayle");
        n2.setEmpID(101);
        n2.display();
            
        HourlyEmployee2 n3 = new HourlyEmployee2(101, "chizkaa");
        n3.setTotalHoursWorked(42);
        n3.setRatePerHour(100); 
        n3.display();
        
        Employee emp = new Employee(102, "Gwen");
        HourlyEmployee2 n4 = new HourlyEmployee2(emp);
        n4.setTotalHoursWorked(42);
        n4.setRatePerHour(100);
        n4.display();
        
        Employee eme = new Employee(103, "Dino");
        HourlyEmployee2 n5 = new HourlyEmployee2(eme,42,100);
        n5.display();
        
        
        System.out.println("\nPiece Worker Employee:");
        PieceWorkerEmployee2 f1 = new PieceWorkerEmployee2(500,10,"joel",102);
        f1.display();
        
        PieceWorkerEmployee2 f2 = new PieceWorkerEmployee2();
        f2.setTotalPiecesFinished(500);
        f2.setRatePerPiece(10);
        f2.setEmpName("Joel2");
        f2.setEmpID(102);
        f2.display();
        
        PieceWorkerEmployee2 f3 = new PieceWorkerEmployee2("joel3",102);
        f3.setTotalPiecesFinished(500);
        f3.setRatePerPiece(10);
        f3.display();
        
        Employee emp1 = new Employee(102, "joel4");
        PieceWorkerEmployee2 f4 = new PieceWorkerEmployee2(emp1);
        f4.setTotalPiecesFinished(500);
        f4.setRatePerPiece(10);
        f4.display();
        
        Employee emp2 = new Employee(101, "joel5");
        PieceWorkerEmployee2 f5 = new PieceWorkerEmployee2(emp2,500,10);
        f5.display();
        
        
        System.out.println("\nComission Employee:");
        
        CommissionEmployee2 a1 = new CommissionEmployee2(15000,"uary",103);
//        System.out.println(a1.computeSalary());
        a1.display();
        
        CommissionEmployee2 a2 = new CommissionEmployee2();
        a2.setEmpName("uary2");
        a2.setEmpID(103);
        a2.setTotalSales(15000);  
//        System.out.println(a2.computeSalary());
        a2.display();
        
        CommissionEmployee2 a3 = new CommissionEmployee2("uary3",103);
        a3.setTotalSales(15000);  
//        System.out.println(a3.computeSalary());
        a3.display();
        
        Employee temp1 = new Employee(103, "uary4");
        CommissionEmployee2 a4 = new CommissionEmployee2(temp1);
        a4.setTotalSales(15000);
        a4.display();
        
        Employee temp2 = new Employee(103, "uary5");
        CommissionEmployee2 a5 = new CommissionEmployee2(temp2,15000);
        a5.display();
        
        System.out.println("\nBased Plus Comission Employee:");
        
        BasedPlusCommissionEmployee2 b1 = new BasedPlusCommissionEmployee2("jomar",104,15000,14000);
        b1.display();
        
        BasedPlusCommissionEmployee2 b2 = new BasedPlusCommissionEmployee2();
        b2.setBaseSalary(14000);
        b2.setTotalSales(15000);
        b2.setEmpName("jomar2");
        b2.setEmpID(104);
        b2.display();
        
        BasedPlusCommissionEmployee2 b3 = new BasedPlusCommissionEmployee2("jomar3",104);
        b3.setBaseSalary(14000);
        b3.setTotalSales(15000);
        b3.display();
        
        Employee temp3 = new Employee(104, "jomar4");
        BasedPlusCommissionEmployee2 b4 = new BasedPlusCommissionEmployee2(temp3);
        b4.setTotalSales(15000);
        b4.setBaseSalary(14000);
        b4.display();
        
        Employee temp4 = new Employee(104, "jomar5");
        BasedPlusCommissionEmployee2 b5 = new BasedPlusCommissionEmployee2(temp4,15000,14000);
        b5.display();
        
        CommissionEmployee2 temp5 = new CommissionEmployee2(15000,"jomar5",104);
        BasedPlusCommissionEmployee2 b6 = new BasedPlusCommissionEmployee2(temp5);
        b6.setBaseSalary(14000);
        b6.display();
        
        CommissionEmployee2 temp6 = new CommissionEmployee2(15000,"jomar6",104);
        BasedPlusCommissionEmployee2 b7 = new BasedPlusCommissionEmployee2(temp6,15000,14000);
        b7.display();
        
        Employee e = new Employee();
    }
}
