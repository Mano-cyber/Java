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

//accessing file
public class ShowFile1 {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //confirms file name
        if (args.length != 1) {
            System.out.println("UsageL ShowFile filename");
            return;
        }
        // following block opens the file and reads then close.
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);

        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch (IOException exc) {
            System.out.println("An I/O Error Occured");
        } finally {
            //closes file{
            try{
                if(fin !=null)fin.close();
            }catch(IOException exc){
                System.out.println("Error closing file");
            }
        }
    }
}
