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

public class ExcDemo1 {

    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated");

            //Generate index exception
            nums[7] = 10;
            System.out.println("this wont show");
        } catch (ArrayIndexOutOfBoundsException exc) {
            //catch exception
            System.out.println("Index out-of-bound");
        }
        System.out.println("After catch statement");
    }
}
