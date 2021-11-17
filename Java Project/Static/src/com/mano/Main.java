package com.mano;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstINstances = new StaticTest("First Instance");
//        System.out.println(firstINstances.getName() + " is instance number " + firstINstances.getNumInstances());
//
//        StaticTest secondINstances = new StaticTest("Second Instance");
//        System.out.println(secondINstances.getName() + " is instance number " + secondINstances.getNumInstances());
//    }
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }
    public static int multiply(int number){
        return number * multiplier;
    }
}
