/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05;

/**
 *
 * @author MO
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1) {
            sample[i] = i;

            for (i = 0; i < 10; i++) {
                System.out.println("this is sample[" + i + "]: " + sample[i]);
            }

        }
    }
}
