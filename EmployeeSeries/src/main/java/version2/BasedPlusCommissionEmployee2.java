/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author cheska
 */
public class BasedPlusCommissionEmployee2 extends CommissionEmployee2{
    private double baseSalary;

    public BasedPlusCommissionEmployee2() {}
    
    public BasedPlusCommissionEmployee2(String empName, int empID) {
        super(empName,empID);
    }
    public BasedPlusCommissionEmployee2(Employee e){
        super(e.getEmpName(),e.getEmpID());
    }
    public BasedPlusCommissionEmployee2(Employee e, double totalSales, double baseSalary){
        this(e.empName, e.empID, totalSales, baseSalary);
    }
    public BasedPlusCommissionEmployee2(String empName, int empID, double totalSales, double baseSalary) {
        super(totalSales,empName,empID);
        this.baseSalary = baseSalary;
    }
    public BasedPlusCommissionEmployee2(CommissionEmployee2 e, double baseSalary){
        this(e.getEmpName(),e.getEmpID(), e.getTotalSales(),baseSalary);
    }
    
    public BasedPlusCommissionEmployee2(CommissionEmployee2 e){
        super(e.getTotalSales(), e.getEmpName(),e.getEmpID());  
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0){
           this.baseSalary = baseSalary; 
        }
    }
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BasedPlusComissionEmployee{");
        sb.append(super.toString());
        sb.append("totalSales=").append(totalSales);
        sb.append(", baseSalary=").append(baseSalary);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        System.out.println(this);
        System.out.println(this.computeSalary());
    }
}
