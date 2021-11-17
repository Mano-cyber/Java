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
// generic functional interface
// interface with 2 paameterd that returns boolean
interface sometest<T> {

    boolean test(T n, T m);
}

public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {

        //determaning if 1 int is factor of another
        sometest<Integer> isfactor = (n, d) -> (n % d) == 0;

        if (isfactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }
        System.out.println();

        // The next lambda expression determines if one Double is  
        // a factor of another. 
        sometest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0, 4.0)) {
            System.out.println("4.0 is a factor of 212.0");
        }
        System.out.println();

        // This lambda expression determines if one string is  
        // part of another. 
        sometest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";

        System.out.println("Testing string: " + str);

        if (isIn.test(str, "face")) {
            System.out.println("'face' is found.");
        } else {
            System.out.println("'face' not found.");
        }
    }
}
