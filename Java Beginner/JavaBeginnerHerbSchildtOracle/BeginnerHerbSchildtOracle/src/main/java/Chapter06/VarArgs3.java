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
class VarArgs3 {

    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): "
                + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...): "
                + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String, int ...): "
                + msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
