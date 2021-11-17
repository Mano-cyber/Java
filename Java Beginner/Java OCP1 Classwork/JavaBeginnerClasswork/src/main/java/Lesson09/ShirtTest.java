/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson09;

/**
 *
 * @author Mano
 */
public class ShirtTest {
    public static void main(String[] args) {
       Shirt shirt01 = new Shirt(33, 'G', "Golf Shirt", 55.50);
       Shirt shirt02 = new Shirt('G', "Golf Shirt", 55.50);
       Shirt shirt03 = new Shirt("Golf Shirt", 55.50);
       Shirt shirt04 = new Shirt(55.50);
       
       //     shirt01.shirtID = 12;
       shirt01.setColorCode('Z');
       
       shirt01.display();
       shirt02.display();
       shirt03.display();
       shirt04.display();
    }   
}
