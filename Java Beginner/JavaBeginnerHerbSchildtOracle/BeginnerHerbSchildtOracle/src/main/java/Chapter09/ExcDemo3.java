/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author MO
 */
public class ExcDemo3 {

    public static void main(String[] args) {
        int numer[] = {4, 18, 16, 32, 64, 168};
        int denom[] = {2, 0, 4, 4, 0, 8};
        
        for(int i=0;i<numer.length;i++){
            try{
                System.out.println(numer[i] + " / " + 
                           denom[i] + " is " + 
                           numer[i]/denom[i]); 
            }
            catch (ArithmeticException exc){
                System.out.println("Can not divide by zero");
            }
        }
    }
}
