/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

/**
 *
 * @author MO
 */
class Pwr {

    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            val = val * base;
        }
    }

    double get_pwr() {
        return val;
    }
}

//class Pwr { 
//  double b; 
//  int e; 
//  double val; 
// 
//  Pwr(double base, int exp) { 
//    this.b = base; 
//    this.e = exp; 
// 
//    this.val = 1; 
//    if(exp==0) return; 
//    for( ; exp>0; exp--) this.val = this.val * base; 
//  } 
// 
//  double get_pwr() { 
//    return this.val; 
//  } 
//}

//Pwr(double b, int e) { 
//  this.b = b; 
//  this.e = e; 
// 
//  val = 1; 
//  if(e==0) return; 
//  for( ; e>0; e--) val = val * b; 
//}

public class DemoPwr {

    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);
        
        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }
}
