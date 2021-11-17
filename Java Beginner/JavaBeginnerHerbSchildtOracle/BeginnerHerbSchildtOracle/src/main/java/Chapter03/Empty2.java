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
// Move more of the for loop
public class Empty2 {
    public static void main(String[] args) {
        int i;
        
        i = 0; // move initilization out of loop.
        for(; i<10;){
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
