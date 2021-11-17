package Mano;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 1;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

        //TEST//

        char charValue = 'C';

        switch(charValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The value is " + charValue);
                break;
//            case 'B':
//                System.out.println("Value is B");
//                break;
//            case 'C':
//                System.out.println("Value is C");
//                break;
//            case 'D':
//                System.out.println("Value is D");
//                break;
//            case 'E':
//                System.out.println("Value is E");
//                break;
            default:
                System.out.println("Value not found");
                break;
        }

    }
}
