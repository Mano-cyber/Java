/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author MO
 */
public class UseCast {
    public static void main(String[] args) {
        int i;
        
        for(i = 0; i < 5; i++){
            System.out.println(i + " /3: " + i / 3);
            System.out.println(i + " / 3 with fractions: " 
                         + (double) i / 3);
            System.out.println();
    }
}
}