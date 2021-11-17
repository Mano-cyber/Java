/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

/**
 *
 * @author MO
 */
public class DecrFor {
    public static void main(String[] args) {
        int x = 0;
        
//        for(x = 100; x > -105; x -=5)
//            System.out.println(x);

        int count;
        for(count = 10; count < 5; count++)
            x += count; // this statement will not execute
    }
}
