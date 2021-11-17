/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

/**
 *
 * @author MO
 */
// Some simple math functions, with isFactor() removed. 

import Chapter15.SupportFuncs; 
 
public class SimpleMathFuncs1 { 
 
  // Return the smallest positive factor that a and b have in common. 
  public static int lcf(int a, int b) { 
    // Factor using positive values. 
    a = Math.abs(a); 
    b = Math.abs(b); 
 
    int min = a < b ? a : b; 
 
    for(int i = 2; i <= min/2; i++) { 
      if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))  
        return i; 
    } 
 
    return 1;     
  } 
 
  // Return the largest positive factor that a and b have in common. 
  public static int gcf(int a, int b) { 
    // Factor using positive values. 
    a = Math.abs(a); 
    b = Math.abs(b); 
 
    int min = a < b ? a : b; 
 
    for(int i = min/2; i >= 2; i--) { 
      if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))  
        return i; 
    } 
 
    return 1;     
  } 
}
