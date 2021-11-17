/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author MO
 */

//interface that tests 2 strings
interface StringTest{
    boolean test(String StringA, String StringB);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        //check if strings is part of another
    StringTest isIn = (a,b) -> a.indexOf(b) != -1;
    
    String string = "this is a test";
    
        System.out.println("Testing string: " + string);
        
        if(isIn.test(string, "is a"))
            System.out.println("'is a' found. ");
        else
            System.out.println("not found");
        
        if(isIn.test(string, "xyz"))
            System.out.println("xyz found");
        else
            System.out.println("xyz not found");
    }
    
     
}
