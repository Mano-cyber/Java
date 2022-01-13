package Lesson8;

import Lesson9.SalesTxnPk.Predicate;

/**
 *
 * @author Mano
 */
public class Pilots implements Predicate<Person>{
    
    @Override
    public boolean test(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
    }
}
