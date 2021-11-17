/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author MO
 */
//using enum constructor, instance variable, method
enum Transport3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // speed of each

    //constructor
    Transport3(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport3 transport;
        
//        display speed of airplane
        System.out.println("the airplane speed is " + 
                Transport3.AIRPLANE.getSpeed() +
                " miles per hour. \n");
    }
}
