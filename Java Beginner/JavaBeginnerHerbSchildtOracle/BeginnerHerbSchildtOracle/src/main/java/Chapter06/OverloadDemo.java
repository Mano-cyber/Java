/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

/**
 *
 * @author MO
 */
//??shows method loverloading
class Overload {

    void ovlDemo() {
        System.out.println("No parameters");
    }

    //Overload ovlDemo for one integer parameter
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    //Overload ovlDemo for two integer parameters
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    //Overload ovlDemo for two double parameters
    double ovlDemo(double a, double b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
}

public class OverloadDemo {

    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        //call all version of ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);

        resD = ob.ovlDemo(1.1, 2.2);
        System.out.println("Result of ob.ovlDemo(1.1,2.2): " + resD);
    }
}
