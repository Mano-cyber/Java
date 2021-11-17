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
//display string backwards
class Backwards{
    String str;
    
    Backwards(String s){
        str = s;
    }
    void backward(int idx){
        if(idx!=str.length()-1) backward(idx+1);
        
        System.out.print(str.charAt(idx));
    }
}
public class BWDemo {
    public static void main(String[] args) {
        Backwards s = new Backwards("This is a test");
        
        s.backward(0);
    }
}
