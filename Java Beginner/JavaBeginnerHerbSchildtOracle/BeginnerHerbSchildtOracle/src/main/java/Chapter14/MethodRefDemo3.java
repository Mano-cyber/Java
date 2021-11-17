///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Chapter14;
//
///**
// *
// * @author MO
// */
//// Demonstrate a Constructor reference. 
// 
//// MyFunc is a functional interface whose method returns 
//// a MyClass reference. 
//interface MyFunc { 
//   MyClass0 func(String s); 
//} 
// 
//class MyClass0 { 
//  private String str; 
// 
//  // This constructor takes an argument. 
//  MyClass0(String s) { str = s; } 
// 
//  // This is the default constructor. 
//  MyClass0() { str = ""; } 
// 
//  // ... 
// 
//  String getStr() { return str; }   
//}     
// 
//class ConstructorRefDemo { 
//  public static void main(String args[]) 
//  { 
//    // Create a reference to the MyClass constructor. 
//    // Because func() in MyFunc takes an argument, new 
//    // refers to the parameterized constructor in MyClass, 
//    // not the default constructor. 
//    MyFunc myClassCons = MyClass0::new; 
// 
//    // Create an instance of MyClass via that constructor reference. 
//    MyClass0 mc = myClassCons.func("Testing"); 
// 
//    // Use the instance of MyClass just created. 
//    System.out.println("str in mc is " + mc.getStr( )); 
//  } 
//}