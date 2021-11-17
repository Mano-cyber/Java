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

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;
        
//        create and use filereader wrapped in bufferedreader
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while((s=br.readLine()) != null){
                System.out.println(s);
            }
        }catch(IOException exc){
            System.out.println("I/O error " + exc);
        }
    }
}
