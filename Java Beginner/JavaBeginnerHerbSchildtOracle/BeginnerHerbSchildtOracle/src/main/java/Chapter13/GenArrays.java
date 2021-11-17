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
//
////Generics and arrays
//class Gen<T extends Number>{
//    T ob;
//    T vals[]; 
//    Gen(T o, T[] nums){
//        ob = o;
//        
////        illegal statement
////  vals = new T[10]; // can't create an array of T 
//
////        valid statement
//    vals = nums; // OK to assign reference to existent array 
//    }
//}
//public class GenArrays {
//    public static void main(String[] args) {
//        
//        Integer n[] = {1,2,3,4,5};
//        
//        Gen<Integer> iOb = new Gen<Integer>(50, n);
//        
//        Gen<?> gen[] = new Gen<?>[50];
//    }
//}
