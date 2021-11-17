/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

/**
 *
 * @author MO
 */
class ChkNum {  
  // return true if x is even 
  boolean isEven(int x) { 
    if((x%2) == 0) return true;  
    else return false; 
  } 
}  
  
public class ParmDemo {  
  public static void main(String args[]) {  
    ChkNum e = new ChkNum(); 
 
    if(e.isEven(10)) System.out.println("10 is even."); 
 
    if(e.isEven(9)) System.out.println("9 is even."); 
 
    if(e.isEven(8)) System.out.println("8 is even."); 
 
  }  
}
