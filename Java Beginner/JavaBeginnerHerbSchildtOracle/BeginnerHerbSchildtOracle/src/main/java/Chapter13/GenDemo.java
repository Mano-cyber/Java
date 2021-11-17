///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Chapter13;
//
///**
// *
// * @author MO
// */
//// A simple generic class.  
//// Here, T is a type parameter that 
//// will be replaced by a real type 
//// when an object of type Gen is created.
//
//class Gen<T>{
//    T ob; //object of type
//    
////    passing constructor a reference to an object 
//    Gen(T o){
//        ob=o;
//    }
//    
////    return ob
//    T getob(){
//        return ob;
//    }
//    
////    show type of T
//    void showType(){
//        System.out.println("Type of T is " + 
//                ob.getClass().getName());
//    }
//}
//public class GenDemo {
//    public static void main(String[] args) {
////        creatiing gen reference for Integers
//        Gen<Integer> iOb;
//        
//        iOb = new Gen<Integer>(88);
//        
////        show type of data
//        iOb.showType();
//        
////        get the value in iOb
//        int v = iOb.getob();
//        System.out.println("value: " + v);
//        
//        System.out.println();
//        
////        create Gen on=bject for Strings
//        Gen<String> strOb = new Gen<String>("Generics Test");
//        
////        show the type of data used by strOb
//        strOb.showType();
//        
//        String str = strOb.getob();
//        System.out.println("vsleu: " + str);
//    }
//}
