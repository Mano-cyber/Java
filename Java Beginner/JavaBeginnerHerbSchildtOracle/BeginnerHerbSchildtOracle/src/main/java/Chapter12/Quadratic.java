/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author MO
 */

// find solotions to quadratic equation
public class Quadratic {
    public static void main(String[] args) {
        double a, b,c,x;
        
        a=4;
        b=1;
        c=-3;
        
//        first solution

    x = (-b + Math.sqrt(Math.pow(b,2) -4 * a * c))/(2*a);
    System.out.println("First solution: " + x);
    
//    second solution. 
    x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("Second solution: " + x); 
    }
}
