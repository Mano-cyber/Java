/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author MO
 */
//block lambda finds smallest positive factor (int value)
interface NumericFunc {

    int func(int n);
}

public class BlockLambdaDemo {

    public static void main(String[] args) {
        //returns smallest positive factor
        NumericFunc smallfactor = (n) -> {
            int result = 1;

//            get absolute value of n
            n = n < 0 ? -n : n;

            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("Smallest factor of 12 is " + smallfactor.func(12));
        System.out.println("Smallest factor of 11 is " + smallfactor.func(11));
    }
}
