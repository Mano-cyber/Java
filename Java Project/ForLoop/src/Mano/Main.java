package Mano;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,00 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,00 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,00 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,00 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //init = code that is initialized at the start of the loop ( i = 0 )
        //termination = tell for loop how to exit in what point to exit ( i < 5 )
        //increment = a count

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + "hello");
        }
        //TEST//
        for (int i = 2; i < 9; i++) {
            System.out.println("10,00 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,00 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = o;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if(count ==3){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

        public static boolean isPrime ( int n){

            if (n == 1) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                System.out.println("Looping " +i);
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;

        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }

    }
}
