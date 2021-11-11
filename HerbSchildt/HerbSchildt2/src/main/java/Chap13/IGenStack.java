/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

/**
 *
 * @author Heino
 */
// A generic stack. 
 
interface IGenStack<T> { 
  void push(T obj) throws StackFullException; 
  T pop() throws StackEmptyException; 
} 
 
// An exception for stack-full errors.   
class StackFullException extends Exception {   
  int size;   
     
  StackFullException(int s) { size = s; }   
   
  public String toString() {   
   return "\nStack is full. Maximum size is " +   
           size;   
  }   
}  