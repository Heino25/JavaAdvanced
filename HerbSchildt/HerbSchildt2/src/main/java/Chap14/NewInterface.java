/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap14;
import java.io.*; 
/**
 *
 * @author Heino
 */
// A functional interface. 
interface MyValue { 
  double getValue();  
} 
 
// Another functional interface. 
interface MyParamValue { 
  double getValue(double v);  
} 

interface NumericTest { 
  boolean test(int n, int m); 
} 

// A functional interface that tests two strings. 
interface StringTest { 
  boolean test(String aStr, String bStr); 
} 
 
// A block lambda that finds the smallest positive factor 
// of an int value. 
 
interface NumericFunc { 
  int func(int n); 
} 

// Use a generic functional interface. 
 
// A generic functional interface with two parameters 
// that returns a boolean result. 
interface SomeTest<T> { 
  boolean test(T n, T m); 
} 

// Use a lambda expression as an argument to a method. 
 
interface StringFunc { 
  String func(String str); 
} 

// An example of capturing a local variable from the enclosing scope. 
 
interface MyFunc { 
  int func(int n); 
} 


 
interface MyIOAction { 
  boolean ioAction(Reader rdr) throws IOException; 
} 

// Demonstrate a method reference for a static method. 
 
// A functional interface for numeric predicates that operate 
// on integer values. 
interface IntPredicate { 
  boolean test(int n); 
} 

