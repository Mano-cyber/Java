/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author MO
 */

/* A version of CopyFile that uses try-with-resources.
   It demonstrates two resources (in this case files) being
   managed by a single try statement.

   Note: This code requires JDK 7 or later.
*/

import java.io.*;

public class CopyFile2 {
    public static void main(String[] args)
    {
        int i;
        
//        confirm both files
        if(args.length != 2){
            System.out.println("CopyFile to ");
            return;
        }
//        open and manage both files with try
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
            {
                do{
                    i = fin.read();
                    if(i != -1) fout.write(i);
                }while(i != -1);
            }catch(IOException exc){
                    System.out.println("IO error: " + exc);
            }
    }
}
