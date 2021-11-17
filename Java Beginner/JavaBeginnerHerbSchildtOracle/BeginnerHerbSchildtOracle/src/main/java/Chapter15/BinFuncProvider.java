/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

/**
 *
 * @author MO
 */
// This interface defines the form of a service provider that 
// obtains BinaryFunc instances. 

 
import Chapter15.BinaryFunc; 
 
public interface BinFuncProvider { 
 
  // Obtain a BinaryFunc. 
  public BinaryFunc get(); 
}