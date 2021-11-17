/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author MO
 */

// using same functional expressions with 3 different lambda expressions
// functional interface that takes two int parameters and returns boolean
interface NumericTest{
    boolean test(int n, int m);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
//        lambda expression determening if number is a factor of another
    NumericTest isFactor = (n ,d) -> (n % d) == 0;
    
    if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
    if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
        System.out.println();
        
//        if first args is less tham 2nd args return true
    NumericTest lessThan = (n, m) -> (n<m);
    
    if (lessThan.test(2, 10))
            System.out.println("2 is a lessThan of 10");
    if(!lessThan.test(10, 2))
            System.out.println("10 is not a lessThan of 2");
        System.out.println();
        
//        return true if both args are equal
    NumericTest equal = (n, m) -> (n<0 ? -n : n) == (m < 0 ? -m : m); 
        
    if(equal.test(4, -4)) 
      System.out.println("Absolute values of 4 and -4 are equal."); 
    if(!lessThan.test(4, -5)) 
      System.out.println("Absolute values of 4 and -5 are not equal.");   
    System.out.println();
    }
}

