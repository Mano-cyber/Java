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
public class NoZeroDiv {
    public static void main(String args[]) { 
    int result; 
 
    for(int i = -5; i < 6; i++) { 
      result = i != 0 ? 100 / i : 0; 
      if(i != 0)  
        System.out.println("100 / " + i + " is " + result); 
    } 
  }
}
