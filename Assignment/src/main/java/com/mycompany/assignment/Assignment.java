/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author cheska
 */
public class Assignment {
    public static void main(String[] args) {
        Account myAccount = new Account(1, "Chizka", 1000.0);
        Account otherAccount = new Account(2, "Yza", 500.0);

        myAccount.display();
        otherAccount.display();
        
        myAccount.deposit(500);
        System.out.println("\nAfter deposit:");
        myAccount.display();
        
        myAccount.withdraw(300);
        System.out.println("\nAfter withdrawal:");
        myAccount.display();
        
        System.out.println("\nChecking balance of myAccount: " + myAccount.checkBalance());
        
        boolean transferSuccess = myAccount.transfer(otherAccount, 200);
        if (transferSuccess) {
            System.out.println("\nAfter transfer of 200 to Yza's account:");
            myAccount.display();
            otherAccount.display();
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
        
        
        
        Vehicle vehicle = new Vehicle("123456", "Toyota", "red", "Toyota Corp.", 180, 0);

        vehicle.display();

        vehicle.accelerate();
        vehicle.accelerate();

        vehicle.decelerate();

        vehicle.setCurrSpeed(180);
        vehicle.accelerate();

        vehicle.setDisabled(true);
        vehicle.repair();
        vehicle.accelerate();
    }
}
