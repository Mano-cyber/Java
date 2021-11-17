/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

// a simple constructor

/**
 *
 * @author MO
 */

class MyClass{
    int x;
    
    MyClass(){
        x = 10;
    }
}
public class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        
        System.out.println(t1.x + " " + t2.x);
    }
}
