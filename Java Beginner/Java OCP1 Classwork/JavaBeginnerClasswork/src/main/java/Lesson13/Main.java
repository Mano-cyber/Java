/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author Mano
 */
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt (15, "Hawaian", 'R', 55.9, 'M', "Short sleeve");
        shirt01.display();
        Shirt shirt02 = new Shirt (16, "Polo", 'R', 25.9, 'M', "Short sleeve");
        shirt01.display();
        
//        System.out.println("..............................");
//        System.out.println("Item1: " +shirt01.toString());
        
        System.out.println("..............................");
        Trouser trouser01 = new Trouser (23, "Cammo", 'G', 65.9, 32, 31);
        trouser01.display();
        
        System.out.println("..............................");
        
        
        System.out.println("\nShirt Description: " + shirt02.getDesc());
        if (shirt02 instanceof Shirt){
            System.out.println("\nPolo Fit: " + ((Shirt)shirt02).getFit());
        }else{
            System.out.println("\nitem is not a shirt");
        }
    }
}