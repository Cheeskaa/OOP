/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author cheska
 */
public class HourlyEmployee2 extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;
    
    
    public HourlyEmployee2() {}
    
    public HourlyEmployee2(Employee e) {
        super(e.getEmpID(), e.getEmpName());
    }
    
    public HourlyEmployee2(int empID, String empName) {
        super(empID, empName);
    }
    
    public HourlyEmployee2(Employee e, float totalHoursWorked, double ratePerHour){
        this(e.getEmpID(), e.getEmpName(), totalHoursWorked, ratePerHour);
    }

    public HourlyEmployee2(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        super(empID, empName);
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
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
    
    public double computeSalary(){
        if (this.totalHoursWorked <= 40){
            return this.totalHoursWorked * this.ratePerHour;
        } else{
            return 40 * this.ratePerHour + ((this.totalHoursWorked - 40) * this.ratePerHour * 1.5);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("totalHoursWorked=").append(totalHoursWorked);
        sb.append(", ratePerHour=").append(ratePerHour);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void display(){
        System.out.println(this);
        System.out.println(this.computeSalary());
    }
    
}
