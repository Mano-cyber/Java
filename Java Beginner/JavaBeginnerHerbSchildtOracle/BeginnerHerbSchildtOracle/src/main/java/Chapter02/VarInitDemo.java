/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author MO
 */
public class VarInitDemo {
    public static void main(String args[]) { 
    int x;  
 
    for(x = 0; x < 3; x++) { 
      int y = -1; // y is initialized each time block is entered 
      System.out.println("y is: " + y); // this always prints -1 
      y = 100;  
      System.out.println("y is now: " + y); 
    } 
  } 
}
