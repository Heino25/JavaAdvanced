/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12;

/**
 *
 * @author Heino
 */
class EnumDemo3 {  
  public static void main(String args[])   
  {  
    Transport tp;  
  
    // Display speed of an airplane.  
    System.out.println("Typical speed for an airplane is " +  
                       Transport.AIRPLANE.getSpeed() +  
                       " miles per hour.\n");  
  
    // Display all Transports and speeds.  
    System.out.println("All Transport speeds: ");  
    for(Transport t : Transport.values())  
      System.out.println(t + " typical speed is " + 
                         t.getSpeed() +  
                         " miles per hour.");  
  }  
}