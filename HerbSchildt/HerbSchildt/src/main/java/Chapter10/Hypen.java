/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author Heino
 */
/* Copy a text file, substituting hyphens for spaces. 
  
   This version uses byte streams. 
 
   To use this program, specify the name   
   of the source file and the destination file.  
   For example, 
  
   java Hyphen source target 
*/  
 
import java.io.*; 
 
class Hyphen { 
  public static void main(String args[])  
  { 
    int i; 
    FileInputStream fin = null; 
    FileOutputStream fout = null; 

    // First make sure that both files have been specified.
    if(args.length !=2 ) {
      System.out.println("Usage: Hyphen From To"); 
      return;
    }
 
    // Copy file and substitute hyphens.
    try { 
      fin = new FileInputStream(args[0]); 
      fout = new FileOutputStream(args[1]); 

      do { 
        i = fin.read(); 

        // convert space to a hypen
        if((char)i == ' ') i = '-'; 

        if(i != -1) fout.write(i); 
      } while(i != -1); 
    } catch(IOException exc) { 
      System.out.println("I/O Error: " + exc); 
    } finally {
      try {
        if(fin != null) fin.close(); 
      } catch(IOException exc) { 
        System.out.println("Error closing input file."); 
      } 

      try {
        if(fin != null) fout.close(); 
      } catch(IOException exc) { 
        System.out.println("Error closing output file."); 
      } 
    }
  } 
}
