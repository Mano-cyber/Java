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
// use commas in a for statement
public class Comma {
    public static void main(String[] args) {
        int i, j;
        
        for(i=0, j=10; i<j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
