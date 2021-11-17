/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author Mano
 */
public class TwoDimensionalArray {
        public static void main(String[] args) {
        int year = 2018;

        int[][] yearlySales = new int[4][4];
        yearlySales[0][0] = 1000;
        yearlySales[0][1] = 1500;
        yearlySales[0][2] = 2000;
        yearlySales[0][3] = 2500;
        yearlySales[1][0] = 3000;
        yearlySales[1][1] = 3500;
        yearlySales[1][2] = 4000;
        yearlySales[1][3] = 4500;
        yearlySales[2][0] = 5000;
        yearlySales[2][1] = 5500;
        yearlySales[2][2] = 6000;
        yearlySales[2][3] = 6500;
        yearlySales[3][0] = 7000;
        yearlySales[3][1] = 7500;
        yearlySales[3][2] = 8000;
        yearlySales[3][3] = 8500;

        for(var i = 0; i < yearlySales.length; i++){
            System.out.println("Year " + year + ": ");
            year = year + 1;
            for(var j = 0; j < yearlySales[i].length; j++){
                System.out.println("\tQ"+(j+1)+": " +yearlySales[i][j]);
            } 
            System.out.println("\n");
        }
    }
}
