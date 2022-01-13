package Lesson9.SalesTxn;

import java.util.List;
import Lesson9.SalesTxnPk.Predicate;

/**
 *
 * @author MikeW
 */
public class A01Predicate {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    
    Predicate<SalesTxn> massSales = 
        t -> t.getState().equals(State.MA);
    
    System.out.println("\n== Sales - Stream");
    tList.stream()
        .filter(massSales)
        .forEach(t -> t.printSummary());
    
    System.out.println("\n== Sales - Method Call");    
    for(SalesTxn t:tList){
        if (massSales.test(t)){
            t.printSummary();
        }
    }
  }
}