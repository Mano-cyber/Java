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

// shows manual boxing and unboxing with type wrapper
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100);
        
        int i = iOb.intValue();
        System.out.println(i + " " + iOb);// displays 100 100
    }
}
