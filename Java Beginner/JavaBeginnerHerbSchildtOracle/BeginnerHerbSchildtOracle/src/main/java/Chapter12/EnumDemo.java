/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.awt.TrayIcon;

/**
 *
 * @author MO
 */
// enumeration of transport 
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {

    public static void main(String[] args) {

        Transport transport;

        transport = Transport.AIRPLANE;

//        output an enum value
        System.out.println("Value of transport: " + transport);
        System.out.println();

        transport = Transport.TRAIN;

//        compare two enum values
        if (transport == Transport.TRAIN) {
            System.out.println("transport contains TRAIN. \n");
        }

//        using enum to control switch statement
        switch (transport) {
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries freight");
                break;
            case AIRPLANE:
                System.out.println("A airplane flies");
                break;
            case TRAIN:
                System.out.println("A trainruns on rails");
                break;
            case BOAT:
                System.out.println("A boat sails on water");
                break;
        }
    }
}
