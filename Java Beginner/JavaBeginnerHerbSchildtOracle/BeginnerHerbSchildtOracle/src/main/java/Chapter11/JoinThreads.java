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

//using join
class MyThread4 implements Runnable{
    Thread thread4;
    
    //new thread
    MyThread4(String name){
        thread4 = new Thread(this, name);
    }
    //main method creates and starts
    public static MyThread4 createAndStartMyThread4(String name){
        MyThread4 myThread4 = new MyThread4(name);
        
        myThread4.thread4.start();
        return myThread4;
    }
    
    //entry point
    public void run(){
        System.out.println(thread4.getName() + " starting");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thread4.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exception){
            System.out.println(thread4.getName() + " interrupted");
        }
        System.out.println(thread4.getName() + " terminating");
    }
}
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        
        MyThread4 mt1 = MyThread4.createAndStartMyThread4("child #1");
        MyThread4 mt2 = MyThread4.createAndStartMyThread4("child #2");
        MyThread4 mt3 = MyThread4.createAndStartMyThread4("child #3");
        
        try{
            mt1.thread4.join();
            System.out.println("Child #1 joined");
            
            mt2.thread4.join();
            System.out.println("Child #3 joined");
            
            mt3.thread4.join();
            System.out.println("Child #3 joined");
        }
        catch(InterruptedException exception){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread ending");
    }
}
