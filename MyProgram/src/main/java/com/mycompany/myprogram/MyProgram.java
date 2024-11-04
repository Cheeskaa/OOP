/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myprogram;

/**
 *
 * @author cheska
 */
public class MyProgram {

    public static void main(String[] args) {
        MyTime clock = new MyTime(23, 59, 56);
        
        System.out.println(clock);
//        x.tickBySecond();
//        System.out.println(x);
//        x.tickBySecond();
//        System.out.println(x);
        
        clock.advanceTime(43200);
        System.out.println(clock);
    }
}
