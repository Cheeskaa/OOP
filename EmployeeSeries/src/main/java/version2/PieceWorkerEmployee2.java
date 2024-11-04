/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author cheska
 */
public class PieceWorkerEmployee2 extends Employee{
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee2() {
    }
    
    public PieceWorkerEmployee2(String empName, int empID) {
        super(empID, empName);
    }
    public PieceWorkerEmployee2(Employee e){
        super(e.getEmpID(),e.getEmpName());
    }
    public PieceWorkerEmployee2(Employee e, double ratePerPiece, int totalPiecesFinished){
        this(totalPiecesFinished, ratePerPiece, e.getEmpName(),e.getEmpID());
    }
    public PieceWorkerEmployee2(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        if (totalPiecesFinished > 0){
            this.totalPiecesFinished = totalPiecesFinished;
        }  
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece > 0){
            this.ratePerPiece = ratePerPiece;
        }
    }
    
    public double computeSalary(){
        return (this.totalPiecesFinished * this.ratePerPiece) + ((this.totalPiecesFinished/100) * (this.ratePerPiece * 10));   
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PieceWorkerEmployee{");
        sb.append(super.toString());
        sb.append("totalPiecesFinished=").append(totalPiecesFinished);
        sb.append(", ratePerPiece=").append(ratePerPiece);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        System.out.println(this);
        System.out.println(this.computeSalary());
    }
}
