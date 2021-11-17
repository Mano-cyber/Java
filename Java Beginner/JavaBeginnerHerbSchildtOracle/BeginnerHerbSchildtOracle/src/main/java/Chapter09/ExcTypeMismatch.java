///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Chapter09;
//
///**
// *
// * @author MO
// */
//public class ExcTypeMismatch {  
//  public static void main(String args[]) {  
//    int nums[] = new int[4];  
//  
//    try {  
//      System.out.println("Before exception is generated."); 
//  
//      // generate an index out-of-bounds exception  
//      nums[7] = 10;  
//      System.out.println("this won't be displayed");  
//    }  
// 
//    /* Can't catch an array boundary error with an  
//       ArithmeticException. */ 
//    catch (ArithmeticException exc) {  
//      // catch the exception  
//      System.out.println("Index out-of-bounds!");  
//    }  
//    System.out.println("After catch statement.");  
//  }  
//}