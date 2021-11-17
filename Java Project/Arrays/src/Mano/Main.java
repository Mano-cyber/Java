package Mano;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; <myIntegers.length; i++){
            System.out.println("Element " + i +" , typed value was " + myIntegers[i]);
        }

    }
}
