/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author MO
 */
public class AutoBox {
    public static void main(String[] args) {
         Integer iOb = 100; // autobox int
         int i = iOb; // auto unbox
         
         System.out.println(i + " " + iOb); //shows 100 100
    }
}
