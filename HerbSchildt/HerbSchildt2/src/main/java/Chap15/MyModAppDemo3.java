/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Chap15;
//
///**
// *
// * @author Heino
// */
//// Updated to use SupportFuncs. 
//package appstart.mymodappdemo; 
// 
//import appfuncs.simplefuncs.SimpleMathFuncs; 
//import appsupport.supportfuncs.SupportFuncs; 
// 
//public class MyModAppDemo { 
//  public static void main(String[] args) { 
// 
//    // Now, isFactor() is referred to via SupportFuncs, 
//    // not SimpleMathFuncs. 
//    if(SupportFuncs.isFactor(2, 10)) 
//      System.out.println("2 is a factor of 10");  
// 
//    System.out.println("Smallest factor common to both 35 and 105 is " + 
//                       SimpleMathFuncs.lcf(35, 105));  
// 
//    System.out.println("Largest factor common to both 35 and 105 is " + 
//                       SimpleMathFuncs.gcf(35, 105));  
// 
//  } 
//}