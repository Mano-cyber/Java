/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.io.*;

/**
 *
 * @author MO
 */
public class ShowFile2 {

    public static void main(String[] args) {
        int i;

        //make sure file is speciifed
        if (args.length != 1) {
            System.out.println("ShowFile2 filename");
            return;
        }

        //this code uses try-with resources to open file and with auto close it when try block if left
        try ( FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I.O error: " + exc);
        }
    }
}
