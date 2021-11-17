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
//2 somple lambda expressions
//functional interface
interface MyValue {

    double getvalue();
}

//another interface
interface myParamValue {

    double getValue(double v);
}

public class LambdaDemo {

    public static void main(String[] args) {
        MyValue myVal; //declaring the interface reference

        myVal = () -> 98.6; //lambda expression
        System.out.println("A constant value: " + myVal.getvalue());

        myParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));
    }
}
