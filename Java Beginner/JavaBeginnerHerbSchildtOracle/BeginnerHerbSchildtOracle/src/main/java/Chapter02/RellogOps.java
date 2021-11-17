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
public class RellogOps {
    public static void main(String args[]) {    
    int i, j; 
    boolean b1, b2; 
 
    i = 10; 
    j = 11; 
    if(i < j) System.out.println("i < j"); 
    if(i <= j) System.out.println("i <= j"); 
    if(i != j) System.out.println("i != j"); 
    if(i == j) System.out.println("this won't execute"); 
    if(i >= j) System.out.println("this won't execute"); 
    if(i > j) System.out.println("this won't execute"); 
 
    b1 = true; 
    b2 = false; 
    if(b1 & b2) System.out.println("this won't execute"); 
    if(!(b1 & b2)) System.out.println("!(b1 & b2) is true"); 
    if(b1 | b2) System.out.println("b1 | b2 is true"); 
    if(b1 ^ b2) System.out.println("b1 ^ b2 is true"); 
  }  
}
