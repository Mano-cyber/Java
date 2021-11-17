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
//showing ordinal() and compareTo()
enum Transport4 {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
public class EnumDemo4 {
    public static void main(String[] args) {
        Transport4 transport, transport2, transport3;
        
//        obtain all ordinal values using ordinal()
        System.out.println("Here are all the transport constants"
                + "and their ordinal values: ");
        for(Transport4 t : Transport4.values())
            System.out.println(t + " " + t.ordinal());
        
        transport = Transport4.AIRPLANE;
        transport2 = Transport4.TRAIN;
        transport3 = Transport4.AIRPLANE;
        
        System.out.println();
        
//        showing comareTo()

        if(transport.compareTo(transport2) < 0)
            System.out.println(transport + " comes before " + transport2);
        
        if(transport.compareTo(transport2) < 0)
            System.out.println(transport2 + " comes before " + transport);
        
        if(transport.compareTo(transport3) < 0)
            System.out.println(transport + " equals " + transport3);
    }
}
