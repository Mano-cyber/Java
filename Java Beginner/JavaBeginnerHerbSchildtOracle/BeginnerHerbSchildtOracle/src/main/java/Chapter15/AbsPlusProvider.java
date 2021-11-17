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
// This is a provider for the AbsPlus function.  
import Chapter15.*;
public class AbsPlusProvider implements BinFuncProvider { 
 
  // Provide an AbsPlus object. 
  public BinaryFunc get() { return new AbsPlus(); } 
}
