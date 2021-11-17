/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08;

/**
 *
 * @author MO
 */
public interface IVehicle {
    //return the range
    int range();
    
    //compute fuel needed for a given distance
    double fuleneeded(int miles);
    
    //access methods for instance variables
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void srtMpg();
}
