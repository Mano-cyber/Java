/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

/**
 *
 * @author MO
 */
class StaticBlock {

    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

public class SDemo3 {

    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is "
                + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is "
                + StaticBlock.rootOf3);

    }
}
