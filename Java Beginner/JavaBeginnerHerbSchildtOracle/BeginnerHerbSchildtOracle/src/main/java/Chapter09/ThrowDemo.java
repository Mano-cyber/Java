/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author MO
 */
public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("before throw");
            throw new ArithmeticException();
        }
        catch(ArithmeticException exc){
            System.out.println("caught");
    }
        System.out.println("after try block");
    }
}
