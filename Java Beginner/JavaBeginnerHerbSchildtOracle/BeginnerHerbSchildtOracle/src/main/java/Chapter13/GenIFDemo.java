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
////generic example
//interface Containment<T>{
////    contains()
////    tests if a specific item is contained within object
//    boolean contain(T o);
//}
//
////implement containment using array to hold values
//class MyClass11<T> implements Containment<T>{
//    T[] arrayRef;
//    
//    MyClass11(T[] o){
//        arrayRef = o;
//    }
//    
////    implement contains
//    public boolean contains (T o){
//        for(T x: arrayRef)
//            if(x.equals(o)) return true;
//        return false;
//    }
//}
//public class GenIFDemo {
//    public static void main(String[] args) {
//        
//            Integer x[] = { 1, 2, 3 }; 
// 
//    MyClass11<Integer> ob = new MyClass11<Integer>(x); 
// 
//    if(ob.contains(2)) 
//      System.out.println("2 is in ob"); 
//    else 
//      System.out.println("2 is NOT in ob"); 
// 
//    if(ob.contains(5)) 
//      System.out.println("5 is in ob"); 
//    else 
//      System.out.println("5 is NOT in ob"); 
//
//    }
//}
