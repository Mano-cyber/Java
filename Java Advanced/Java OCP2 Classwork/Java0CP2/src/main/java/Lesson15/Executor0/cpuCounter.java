/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Executor0;

/**
 *
 * @author fabio
 */
public class cpuCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cpuCount = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuCount);
    }
    
}
