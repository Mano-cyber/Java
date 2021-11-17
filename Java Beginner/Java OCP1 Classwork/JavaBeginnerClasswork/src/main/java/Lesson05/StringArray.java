/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson05;

/**
 *
 * @author Mano
 */
public class StringArray {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Miyi";
        names[1] = "Eddie";
        names[2] = "Will";
        names[3] = "Jack";
        
        for (String name : names){
            System.out.println("My name is " + name);
            if (name == "Miyi"){
                break;
            }
        }
            
    }
}