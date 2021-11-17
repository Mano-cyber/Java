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

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        System.out.println("Enter text ('stop' to quit)");
        
        try(FileWriter fw = new FileWriter("test.txt")){
            do{
                System.out.print(": ");
                str = br.readLine();
                
                if(str.compareTo("stop") ==0 )
                    break;
                
                str = str + "\rn"; //adding newline
                fw.write(str);
            }while(str.compareTo("stop") != 0);
        }catch(IOException exception) {
            System.out.println("I/O error " + exception);
        }
    }
}
