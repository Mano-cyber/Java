/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05;

/**
 *
 * @author MO
 */
public class Encode {

    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefghi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        //encode the message
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) {
                j = 0;
            }

            System.out.print("Encode message: ");
            System.out.println(encmsg);

            //Decode the message
            j = 0;
       //     for (int i = 0; i < msg.length(); i++) {
                decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
                j++;
                if (j == 8) {
                    j = 0;
                }

                System.out.print("Encode message: ");
                System.out.println(encmsg);
            }
        }
    }
