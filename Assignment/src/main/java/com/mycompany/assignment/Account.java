/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author cheska
 */
public class Account {
    private double currentBalance;
    private double availableBalance;
    private String accountName;
    private int accountNumber;

    // Constructor with initial balance
    public Account(int accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.currentBalance = initialBalance;
        this.availableBalance = initialBalance;
    }

    // Deposit method
    public boolean deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            availableBalance += amount;
            return true;
        } else {
            return false;
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= availableBalance) {
            currentBalance -= amount;
            availableBalance -= amount;
            return true;
        }
        return false;
    }

    // Check balance method
    public double checkBalance() {
        return currentBalance;
    }

    // Transfer method to another account
    public boolean transfer(Account another, double amount) {
        if (amount > 0 && amount <= availableBalance) {
            this.withdraw(amount);  // Withdraw the amount from this account
            another.deposit(amount);  // Deposit the amount into the target account
            return true;
        } else {
            return false;
        }
    }
    
    // Getter for currentBalance
    public double getCurrentBalance() {
        return currentBalance;
    }

    // Getter for availableBalance
    public double getAvailableBalance() {
        return availableBalance;
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }

    // Setter for accountName (if needed)
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Display method to print account details in a formatted way
    public void display() {
        System.out.println("Account ID: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Available Balance: " + availableBalance);
    }
}
