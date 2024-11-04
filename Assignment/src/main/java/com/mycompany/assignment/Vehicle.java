/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author cheska
 */
public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;
    
    public Vehicle(String plateNumber, String model, String color, String manufacturer, int topSpeed, int currSpeed) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.color = color;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.disabled = false;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean accelerate() {
        if (!disabled && currSpeed < topSpeed) {
            int prevSpeed = currSpeed;
            currSpeed = Math.min(currSpeed + 10, topSpeed);
            System.out.println("The " + color + " " + model + " with a plate number " + plateNumber + " is accelerating from " + prevSpeed + "kph to " + currSpeed + "kph.");
            return true;
        } else if (disabled) {
            System.out.println("The vehicle is disabled and cannot accelerate.");
            return false;
        } else {
            System.out.println("The vehicle is already at top speed.");
            return false;
        }
    }

    public boolean decelerate() {
        if (!disabled && currSpeed > 0) {
            int prevSpeed = currSpeed;
            currSpeed = Math.max(currSpeed - 10, 0);
            System.out.println("The " + color + " " + model + " with a plate number " + plateNumber + " is decelerating from " + prevSpeed + "kph to " + currSpeed + "kph.");
            return true;
        } else if (disabled) {
            System.out.println("The vehicle is disabled and cannot decelerate.");
            return false;
        }
        return false;
    }

    public void repair() {
        if (disabled) {
            disabled = false;
            System.out.println("The vehicle has been repaired.");
        } else {
            System.out.println("The vehicle is not broken.");
        }
    }

    public void display() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + color);
        System.out.println("Top Speed: " + topSpeed + "kph");
        System.out.println("Current Speed: " + currSpeed + "kph");
        System.out.println("Disabled: " + (disabled ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "The " + color + " " + model + " with plate number " + plateNumber + " is currently at " + currSpeed + "kph.";
    }
}

