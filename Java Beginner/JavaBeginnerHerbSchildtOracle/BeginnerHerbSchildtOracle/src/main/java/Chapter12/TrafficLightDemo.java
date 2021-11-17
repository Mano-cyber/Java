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
// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
    RED, GREEN, YELLOW
}

// computerized traffic light
class TrafficLightSimlulator implements Runnable {

    private TrafficLightColor tlc; //holds current traffic color
    private boolean stop = false; //set to true to stop simulation
    private boolean changed = false; // true when light is changed

    TrafficLightSimlulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimlulator() {
        tlc = TrafficLightColor.RED;
    }

    //start up light
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(10000); // green for 10 sec
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // yellow for 2 sec
                        break;
                    case RED:
                        Thread.sleep(12000); // green for 12 sec
                        break;
                }
            } catch (InterruptedException Exception) {
                System.out.println(Exception);
            }
            changeColor();
        }
    }

//    change color
    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.YELLOW;
                break;
            case GREEN:
                tlc = TrafficLightColor.GREEN;
        }
        changed = true;
        notify();// signal that color changed
    }
//    wait until change

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait(); //wait for change
            }
            changed = false;
        } catch (InterruptedException Exception) {
            System.out.println(Exception);
        }
    }

//    return current color
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

//    stop traffic light
    synchronized void cancel() {
        stop = true;
    }
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimlulator t1 = new TrafficLightSimlulator(TrafficLightColor.GREEN);
        
        Thread thread = new Thread(t1);
        thread.start();
        
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
