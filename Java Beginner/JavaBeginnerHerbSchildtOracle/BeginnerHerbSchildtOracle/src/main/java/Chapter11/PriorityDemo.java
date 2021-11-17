/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author MO
 */
// shows thread priorities
class Priority implements Runnable {

    int count;
    Thread thread;

    static boolean stop = false;
    static String currentName;

    //making new thread
    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    //entry point
    public void run() {
        System.out.println(thread.getName() + " starting");
        do {
            count++;

            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = false;
        System.out.println("\n " + thread.getName()
                + "terminating");
    }
}

public class PriorityDemo {

    public static void main(String[] args) {

        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low priority");
        Priority mt3 = new Priority("Normal priority #1");
        Priority mt4 = new Priority("Normal priority #2");
        Priority mt5 = new Priority("Normal priority #3");

//        set priorities
        mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        //3,4,5 will be default no adding code needed
        //start threads
        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nHigh priority thread counted to "
                + mt1.count);
        System.out.println("Low priority thread counted to "
                + mt2.count);
        System.out.println("1st Normal priority thread counted to "
                + mt3.count);
        System.out.println("2nd Normal priority thread counted to "
                + mt4.count);
        System.out.println("3rd Normal priority thread counted to "
                + mt5.count);
    }

}
