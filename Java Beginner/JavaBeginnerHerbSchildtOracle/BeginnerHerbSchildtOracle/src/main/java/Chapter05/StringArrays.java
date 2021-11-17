/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05;

/**
 *
 * @author MO
 */
public class StringArrays {
    public static void main(String args[]) {  
    String strs[] = { "This", "is", "a", "test." };  
  
    System.out.println("Original array: ");  
    for(String s : strs)
      System.out.print(s + " ");  
    System.out.println("\n");  
  
    // change a string  
    strs[1] = "was";  
    strs[3] = "test, too!";  
  
    System.out.println("Modified array: "); 
    for(String s : strs)
      System.out.print(s + " ");  
  }  
}
