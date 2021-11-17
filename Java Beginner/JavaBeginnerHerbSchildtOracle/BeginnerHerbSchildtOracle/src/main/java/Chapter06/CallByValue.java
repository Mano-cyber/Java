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
class Test {

    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

public class CallByValue {

    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
