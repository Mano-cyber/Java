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
//a simple generic class with two parameters
class TwoGen<T, V> {

    T pt;
    V pv;

//    pass constructor a reference to object T
    TwoGen(T t, V v) {
        pt = t;
        pv = v;
    }

//    shows type of T and V
    void showTypes() {
        System.out.println("Type of T is "
                + pt.getClass().getName());

        System.out.println("Type of V is "
                + pv.getClass().getName());
    }
    
    T getpt(){
        return pt;
    }
    
    V getpv(){
        return pv;
    }
}

public class SimpleGen {
    public static void main(String[] args) {
        
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Generics");
        
//        show types
        tgObj.showTypes();
        
//        get and show values
        int v = tgObj.getpt();
        System.out.println("value: " + v);
        
        String str = tgObj.getpv();
        System.out.println("value: " + str);
    }
}
