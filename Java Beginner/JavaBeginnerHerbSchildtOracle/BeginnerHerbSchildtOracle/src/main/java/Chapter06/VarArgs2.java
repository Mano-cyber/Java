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
public class VarArgs2 {

    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contents: ");
        
        for(int i=0; i<v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three vararg: ", 1,2,3);
        vaTest("No varargs: ");
    }
}
