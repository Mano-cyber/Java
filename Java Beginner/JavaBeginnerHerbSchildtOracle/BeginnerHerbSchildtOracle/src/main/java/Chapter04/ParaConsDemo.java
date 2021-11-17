/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

/**
 *
 * @author MO
 */
class MyClass1{
    int x;
    
    MyClass1(int i){
        x = i;
    }
}
public class ParaConsDemo {
    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1(10);
        MyClass1 t2 = new MyClass1(88);
        
        System.out.println(t1.x + " " + t2.x);
    }
}