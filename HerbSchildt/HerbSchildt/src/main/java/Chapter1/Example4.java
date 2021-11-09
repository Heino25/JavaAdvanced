/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author Heino
 */
public class Example4 {
    public static void main(String[] args) {
        double gallons; //hold the number of gallons
        double liters; //hold convertions to liters
        
        gallons = 10; // start with 10 gallons
        
        liters = gallons * 3.7854; // convert to liters
        
        System.out.println(gallons + "gallons is " + liters + " liters");
    }
}
