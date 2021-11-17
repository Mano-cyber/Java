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

//deprecate a class
@Deprecated
class MyClassD{
    private String msg;
    
    MyClassD(String m){
        msg= m;
    }
    
//    deprecate a method within a class
    @Deprecated
    String getMsg(){
        return msg;
    }
}
public class AnnoDemo {
    public static void main(String[] args) {
        MyClassD myObj = new MyClassD("test");
        
        System.out.println(myObj.getMsg());
    }
}
