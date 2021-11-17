/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

/**
 *
 * @author MO
 */
public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;
        
        for(int i = 0; i < num; i++){
            if(i*i >= num)
                break;
            System.out.print(i + " ");
        }
        System.out.println("Loop completed");
    }
}
