/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author MO
 */
class Gen<T> {

    T ob; //declaring an object of type T

//    passing constructor as reference to object T
    Gen(T o) {
        ob = o;
    }

//    return ob
    T getob() {
        return ob;
    }
}

public class RawDemo {

    public static void main(String[] args) {

//        creating gen object for Integers
        Gen<Integer> iOb = new Gen<Integer>(88);

//        creating gen object for String
        Gen<String> strOb = new Gen<String>("Generics Test");

//        creating raw-type Gen giving a double
        Gen raw = new Gen(98.6);

//        casting necessary because type is unknown
        double d = (Double) raw.getob();
        System.out.println("vale: " + d);

        // The use of a raw type can lead to run-time. 
        // exceptions.  Here are some examples. 
        // The following cast causes a run-time error! 
//    int i = (Integer) raw.getob(); // run-time error 
        // This assigment overrides type safety. 
        strOb = raw; // OK, but potentially wrong 
//    String str = strOb.getob(); // run-time error  

        // This assingment also overrides type safety. 
        raw = iOb; // OK, but potentially wrong 
//    d = (Double) raw.getob(); // run-time error 
    }
}
