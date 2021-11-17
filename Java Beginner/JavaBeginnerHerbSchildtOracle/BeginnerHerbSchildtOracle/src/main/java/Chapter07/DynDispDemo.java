/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter07;

/**
 *
 * @author MO
 */
class Sup { 
  void who() { 
    System.out.println("who() in Sup"); 
  } 
} 
 
class Sub1 extends Sup { 
  void who() { 
    System.out.println("who() in Sub1"); 
  } 
} 
 
class Sub2 extends Sup { 
  void who() { 
    System.out.println("who() in Sub2"); 
  } 
} 
 
class DynDispDemo { 
  public static void main(String args[]) { 
    Sup superOb = new Sup(); 
    Sub1 subOb1 = new Sub1(); 
    Sub2 subOb2 = new Sub2(); 
 
    Sup supRef;  
 
    supRef = superOb;  
    supRef.who(); 
 
    supRef = subOb1;  
    supRef.who(); 
 
    supRef = subOb2;  
    supRef.who(); 
  } 
}
