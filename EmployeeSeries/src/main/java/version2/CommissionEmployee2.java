/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author cheska
 */
public class CommissionEmployee2 extends Employee{
    public double totalSales;
    
    public CommissionEmployee2() {}
    
    public CommissionEmployee2(String empName, int empID) {
        super(empID, empName);
    }
    public CommissionEmployee2(Employee e) {
        super(e.empID, e.empName);
    }
    public CommissionEmployee2(Employee e, double totalSales){
        this(totalSales,e.empName, e.empID);
    }
    public CommissionEmployee2(double totalSales, String empName, int empID) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public double computeSalary(){
        float rate;
        if (this.totalSales < 10000){
            rate = 0.05f;
        } else if (this.totalSales < 100000){
            rate = 0.1f;
        } else if (this.totalSales < 1000000){
            rate = 0.2f;
        } else{
            rate = 0.3f;
        }
        return this.totalSales * rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComissionEmployee{");
        sb.append(super.toString());
        sb.append("totalSales=").append(totalSales);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void display(){
        System.out.println(this);
        System.out.println(this.computeSalary());
    }
}
