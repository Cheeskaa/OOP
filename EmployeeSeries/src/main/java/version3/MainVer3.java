/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author cheska
 */
public class MainVer3 {
    public static void main(String[] args) {
        HourlyV3 e1 = new HourlyV3(101, new Name("Cheska", "E.", "Ouano"), new Date(05,02,2005), new Date(10,14,2024), 100, 50);
        PieceWorkerV3 p1 = new PieceWorkerV3(102, new Name("joel", "M.", "monsalud"), new Date(07,22,2005), new Date(10,14,2024), 100, 50);
        CommissionV3 s1 = new CommissionV3(103, new Name("Jomar", "cunado"), new Date(02,14,2004), new Date(10,14,2024), 1600);
        BPCommissionV3 b1 = new BPCommissionV3(104, new Name("uary", "toledo"), new Date(01,21,2004), new Date(10,14,2024), 1800, 1200);
        
        
        System.out.print("\nHourly Employee:\n");
        e1.display();
        System.out.print("\nPiece Worker Employee:\n");
        p1.display();
        System.out.print("\nCommission Employee:\n");
        s1.display();
        System.out.print("\nBased Plus Commission Employee:\n");
        b1.display();
        
    }
}
