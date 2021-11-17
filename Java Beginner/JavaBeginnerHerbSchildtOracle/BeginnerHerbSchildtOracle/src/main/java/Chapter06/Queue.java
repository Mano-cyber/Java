/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

/**
 *
 * @author MO
 */
public class Queue {  
  // these members are now private 
  private char q[]; // this array holds the queue  
  private int putloc, getloc; // the put and get indices  
  
  Queue(int size) {  
    q = new char[size]; // allocate memory for queue  
    putloc = getloc = 0;  
  }  
  
  // Put a characer into the queue. 
  void put(char ch) {  
    if(putloc==q.length) {  
      System.out.println(" -- Queue is full.");  
      return;  
    }  
      
    q[putloc++] = ch;  
  }  
  
  // Get a character from the queue. 
  char get() {  
    if(getloc == putloc) {  
      System.out.println(" -- Queue is empty.");  
      return (char) 0;   
    }  
    
    return q[getloc++];  
  }  
}
